package com.github.clbxg.MultipleDataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.clbxg.Mapper.MySqlMapper;
//import com.github.clbxg.Mapper.SqlServerMapper;

/**
 * MyBatis配置多数据源
 * 手动切换
 * @author Administrator
 * @创建日期 2016.3.5
 */
public class Main {
    public static void main(String[] args) {
        //初始化ApplicationContext
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");

        MySqlMapper mySqlMapper = applicationContext.getBean(MySqlMapper.class);

        //SqlServerMapper sqlServerMapper = applicationContext.getBean(SqlServerMapper.class);
        
        //设置数据源为MySql,使用了AOP测试时请将下面这行注释
        MultipleDataSource.setDataSourceKey("mySqlDataSource");
        mySqlMapper.getList();
        //设置数据源为SqlServer,使用AOP测试时请将下面这行注释
        //MultipleDataSource.setDataSourceKey("sqlServerDataSource");
        //sqlServerMapper.getList();
    }
}