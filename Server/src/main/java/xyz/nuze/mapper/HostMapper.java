package xyz.nuze.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xyz.nuze.model.Host;
import xyz.nuze.model.HostExample;

public interface HostMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host
     *
     * @mbg.generated Sun Jun 30 15:11:14 AEST 2019
     */
    long countByExample(HostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host
     *
     * @mbg.generated Sun Jun 30 15:11:14 AEST 2019
     */
    int deleteByExample(HostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host
     *
     * @mbg.generated Sun Jun 30 15:11:14 AEST 2019
     */
    int insert(Host record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host
     *
     * @mbg.generated Sun Jun 30 15:11:14 AEST 2019
     */
    int insertSelective(Host record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host
     *
     * @mbg.generated Sun Jun 30 15:11:14 AEST 2019
     */
    List<Host> selectByExample(HostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host
     *
     * @mbg.generated Sun Jun 30 15:11:14 AEST 2019
     */
    int updateByExampleSelective(@Param("record") Host record, @Param("example") HostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host
     *
     * @mbg.generated Sun Jun 30 15:11:14 AEST 2019
     */
    int updateByExample(@Param("record") Host record, @Param("example") HostExample example);
}