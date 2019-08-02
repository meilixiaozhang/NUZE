package xyz.nuze.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xyz.nuze.model.House;
import xyz.nuze.model.HouseExample;

public interface HouseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Tue Jul 16 22:06:49 AEST 2019
     */
    long countByExample(HouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Tue Jul 16 22:06:49 AEST 2019
     */
    int deleteByExample(HouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Tue Jul 16 22:06:49 AEST 2019
     */
    int deleteByPrimaryKey(Integer houseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Tue Jul 16 22:06:49 AEST 2019
     */
    int insert(House record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Tue Jul 16 22:06:49 AEST 2019
     */
    int insertSelective(House record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Tue Jul 16 22:06:49 AEST 2019
     */
    List<House> selectByExample(HouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Tue Jul 16 22:06:49 AEST 2019
     */
    House selectByPrimaryKey(Integer houseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Tue Jul 16 22:06:49 AEST 2019
     */
    int updateByExampleSelective(@Param("record") House record, @Param("example") HouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Tue Jul 16 22:06:49 AEST 2019
     */
    int updateByExample(@Param("record") House record, @Param("example") HouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Tue Jul 16 22:06:49 AEST 2019
     */
    int updateByPrimaryKeySelective(House record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Tue Jul 16 22:06:49 AEST 2019
     */
    int updateByPrimaryKey(House record);

    List<House> getHouseList(@Param("limit") Integer limit,@Param("offset") Integer offset, @Param("city") String city,@Param("price") Integer price,@Param("guests") Integer guests );
    List<House> getHouseInfoById(@Param("houseId") Integer houseId);
}