package com.github.clbxg.Mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;
/**
 * MyBatis配置多数据源
 * MySQL的映射接口
 * @author Administrator
 * @创建日期 2016.3.5
 */
public interface MySqlMapper 
{
	// MySql映射：在jdbc.properties文件中配置数据库基本信息
	// 数据库名为：CLBXGManager--select * from CLBXGManager.user
    @Select("select * from user")
    List<Map<String,Object>> getList();
}

