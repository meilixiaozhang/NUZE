package xyz.nuze.controllers;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import xyz.nuze.error.BusinessException;
import xyz.nuze.error.EmBusinessError;
import xyz.nuze.model.Client;
import xyz.nuze.model.Host;
import xyz.nuze.model.User;
import xyz.nuze.response.CommonReturnType;
import xyz.nuze.services.ClientService;
import xyz.nuze.services.HostService;
import xyz.nuze.services.UserService;
import xyz.nuze.utils.JWT.SecurityUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @CreatyBy Michael
 * @Date 2019-07-02 13:56
 */


@RestController
@CrossOrigin
@RequestMapping(value = "/users")
public class UserController extends BaseController {

    @Autowired
    UserService userService;

    @Autowired
    HostService hostService;

    @Autowired
    ClientService clientService;

    @ApiOperation(value = "User register" ,  notes="User register")
    @PostMapping("")
    @Transactional(rollbackFor = BusinessException.class)
    public CommonReturnType register(@RequestBody
                                         @ApiParam(value = "{ <br/>" +
                                                 "&nbsp&nbsp&nbsp&nbsp\"username\": 123,<br/>" +
                                                 "&nbsp&nbsp&nbsp&nbsp\"password\": 123456, <br/>" +
                                                 "&nbsp&nbsp&nbsp&nbsp\"type\": 0, <br/>" +
                                                 "}")
                                                 Map<String, String> body) throws BusinessException {
        String username = body.get("username");
        String password = body.get("password");
        String type = body.get("type");


        if(type == null) {
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR);
        }

        Integer userGroup = Integer.parseInt(type);

        if (StringUtils.isBlank(password) || StringUtils.isBlank(username)) {
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR);
        }

        if (userGroup != 0 && userGroup != 1) {
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR);
        }

        User user = userService.getUserByUsername(username);
        if (user != null) {
            Integer currUserId = user.getUserId();
            if (
                    1 == userGroup && hostService.getHostByLoginId(currUserId) != null ||
                            0 == userGroup && clientService.getClientByLoginId(currUserId) != null
            ) {
                throw new BusinessException(EmBusinessError.USERNAME_HAS_BEEN_REGISTED);
            }
        }

        Integer userId;
        // create User model
        if (user == null) {
            User newUser = new User();
            newUser.setPassword(password);
            newUser.setUserName(username);
            userId = userService.userRegister(newUser);
        } else {
            userId = user.getUserId();
        }

        System.out.println(userId);

        // register
        if (1 == userGroup) {
            hostService.insertHost(userId);
        } else {
            clientService.insertClient(userId);
        }

        return CommonReturnType.create("create success");
    }


    @ApiOperation(value = "User register" ,  notes="User register")
    @GetMapping("")
    public CommonReturnType getUserInfo(HttpServletRequest request) throws BusinessException {
        Integer clientId = SecurityUtils.getUserIdFromToken(request, "client");
        Integer hostId = SecurityUtils.getUserIdFromToken(request, "host");
        if (clientId == null && hostId == null) {
            throw new BusinessException(EmBusinessError.INVALID_JWT_TOKEN);
        }
        if (clientId != null) {
            Client client = clientService.getClientByLoginId(clientId);
            return CommonReturnType.create(clientId, "Get client info successful");
        }
        Host host = hostService.getHostByLoginId(hostId);
        return CommonReturnType.create(host, "Get client info successful");
    }
}
