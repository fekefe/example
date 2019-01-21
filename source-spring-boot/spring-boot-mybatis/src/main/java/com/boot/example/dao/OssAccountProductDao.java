package com.boot.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/1/18
 */
@Mapper
@Repository
public interface OssAccountProductDao {
	
	int insertSelective( @Param("record") Map record);
	
	int insertSelectiveBatch( @Param("record") Map record);
	
	Map selectByPrimaryKey(@Param("id") Long id);
	
	Map selectByNewId( @Param("newId") String newId);
	
	Map selectById( @Param("id") Long id, @Param("userProductId") String userProductId);
	
}