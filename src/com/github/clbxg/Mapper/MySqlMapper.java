package com.github.clbxg.Mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;
/**
 * MyBatis���ö�����Դ
 * MySQL��ӳ��ӿ�
 * @author Administrator
 * @�������� 2016.3.5
 */
public interface MySqlMapper 
{
	// MySqlӳ�䣺��jdbc.properties�ļ����������ݿ������Ϣ
	// ���ݿ���Ϊ��CLBXGManager--select * from CLBXGManager.user
    @Select("select * from user")
    List<Map<String,Object>> getList();
}

