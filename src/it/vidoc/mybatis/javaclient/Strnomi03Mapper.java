package it.vidoc.mybatis.javaclient;

import it.vidoc.mybatis.javamodel.Strnomi03;
import it.vidoc.mybatis.javamodel.Strnomi03Example;
import it.vidoc.mybatis.javamodel.Strnomi03Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Strnomi03Mapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strnomi03
	 * @mbggenerated
	 */
	int countByExample(Strnomi03Example example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strnomi03
	 * @mbggenerated
	 */
	int deleteByExample(Strnomi03Example example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strnomi03
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Strnomi03Key key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strnomi03
	 * @mbggenerated
	 */
	int insert(Strnomi03 record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strnomi03
	 * @mbggenerated
	 */
	int insertSelective(Strnomi03 record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strnomi03
	 * @mbggenerated
	 */
	List<Strnomi03> selectByExample(Strnomi03Example example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strnomi03
	 * @mbggenerated
	 */
	Strnomi03 selectByPrimaryKey(Strnomi03Key key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strnomi03
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") Strnomi03 record, @Param("example") Strnomi03Example example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strnomi03
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") Strnomi03 record, @Param("example") Strnomi03Example example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strnomi03
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(Strnomi03 record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strnomi03
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Strnomi03 record);
}