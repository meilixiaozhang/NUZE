package xyz.nuze.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xyz.nuze.model.HouseReview;
import xyz.nuze.model.HouseReviewExample;

public interface HouseReviewMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_review
     *
     * @mbg.generated Fri Jul 19 11:57:50 AEST 2019
     */
    long countByExample(HouseReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_review
     *
     * @mbg.generated Fri Jul 19 11:57:50 AEST 2019
     */
    int deleteByExample(HouseReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_review
     *
     * @mbg.generated Fri Jul 19 11:57:50 AEST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_review
     *
     * @mbg.generated Fri Jul 19 11:57:50 AEST 2019
     */
    int insert(HouseReview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_review
     *
     * @mbg.generated Fri Jul 19 11:57:50 AEST 2019
     */
    int insertSelective(HouseReview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_review
     *
     * @mbg.generated Fri Jul 19 11:57:50 AEST 2019
     */
    List<HouseReview> selectByExample(HouseReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_review
     *
     * @mbg.generated Fri Jul 19 11:57:50 AEST 2019
     */
    HouseReview selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_review
     *
     * @mbg.generated Fri Jul 19 11:57:50 AEST 2019
     */
    int updateByExampleSelective(@Param("record") HouseReview record, @Param("example") HouseReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_review
     *
     * @mbg.generated Fri Jul 19 11:57:50 AEST 2019
     */
    int updateByExample(@Param("record") HouseReview record, @Param("example") HouseReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_review
     *
     * @mbg.generated Fri Jul 19 11:57:50 AEST 2019
     */
    int updateByPrimaryKeySelective(HouseReview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_review
     *
     * @mbg.generated Fri Jul 19 11:57:50 AEST 2019
     */
    int updateByPrimaryKey(HouseReview record);

    List<HouseReview> getHouseReviews(@Param("limit") Integer limit,@Param("offset") Integer offset, @Param("houseId") Integer houseId);

}