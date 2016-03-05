package com.github.clbxg.MultipleDataSource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * MyBatis配置多数据源
 * @author Administrator
 * @创建日期 2016.3.5
 */
public class MultipleDataSource extends AbstractRoutingDataSource 
{
    private static final ThreadLocal<String>
    		dataSourceKey = new InheritableThreadLocal<String>();

    public static void setDataSourceKey(String dataSource) 
    {
        dataSourceKey.set(dataSource);
    }

    @Override
    protected Object determineCurrentLookupKey() 
    {
        return dataSourceKey.get();
    }
}
