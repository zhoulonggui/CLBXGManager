package com.github.clbxg.Mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

/**
 * MyBatis配置多数据源
 * SQLServer的映射接口
 * @author Administrator
 * @创建日期 2016.3.5
 */
public interface SqlServerMapper {
    @Select("select * from user")
    List<Map<String,Object>> getList();
}