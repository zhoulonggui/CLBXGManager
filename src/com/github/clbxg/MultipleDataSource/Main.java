package com.github.clbxg.MultipleDataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.clbxg.Mapper.MySqlMapper;
//import com.github.clbxg.Mapper.SqlServerMapper;

/**
 * MyBatis���ö�����Դ
 * �ֶ��л�
 * @author Administrator
 * @�������� 2016.3.5
 */
public class Main {
    public static void main(String[] args) {
        //��ʼ��ApplicationContext
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");

        MySqlMapper mySqlMapper = applicationContext.getBean(MySqlMapper.class);

        //SqlServerMapper sqlServerMapper = applicationContext.getBean(SqlServerMapper.class);
        
        //��������ԴΪMySql,ʹ����AOP����ʱ�뽫��������ע��
        MultipleDataSource.setDataSourceKey("mySqlDataSource");
        mySqlMapper.getList();
        //��������ԴΪSqlServer,ʹ��AOP����ʱ�뽫��������ע��
        //MultipleDataSource.setDataSourceKey("sqlServerDataSource");
        //sqlServerMapper.getList();
    }
}