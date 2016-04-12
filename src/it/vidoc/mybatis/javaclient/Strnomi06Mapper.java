package it.vidoc.mybatis.javaclient;

import it.vidoc.mybatis.javamodel.Strnomi06;
import it.vidoc.mybatis.javamodel.Strnomi06Example;
import it.vidoc.mybatis.javamodel.Strnomi06Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Strnomi06Mapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strnomi06
	 * @mbggenerated
	 */
	int countByExample(Strnomi06Example example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strnomi06
	 * @mbggenerated
	 */
	int deleteByExample(Strnomi06Example example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strnomi06
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Strnomi06Key key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strnomi06
	 * @mbggenerated
	 */
	int insert(Strnomi06 record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strnomi06
	 * @mbggenerated
	 */
	int insertSelective(Strnomi06 record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strnomi06
	 * @mbggenerated
	 */
	List<Strnomi06> selectByExample(Strnomi06Example example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strnomi06
	 * @mbggenerated
	 */
	Strnomi06 selectByPrimaryKey(Strnomi06Key key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strnomi06
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") Strnomi06 record, @Param("example") Strnomi06Example example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strnomi06
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") Strnomi06 record, @Param("example") Strnomi06Example example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strnomi06
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(Strnomi06 record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strnomi06
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Strnomi06 record);
}