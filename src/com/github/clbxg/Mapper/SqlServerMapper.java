package com.github.clbxg.Mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

/**
 * MyBatis���ö�����Դ
 * SQLServer��ӳ��ӿ�
 * @author Administrator
 * @�������� 2016.3.5
 */
public interface SqlServerMapper {
    @Select("select * from user")
    List<Map<String,Object>> getList();
}