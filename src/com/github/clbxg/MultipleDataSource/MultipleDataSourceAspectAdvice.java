package com.github.clbxg.MultipleDataSource;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.github.clbxg.Mapper.MySqlMapper;
import com.github.clbxg.Mapper.SqlServerMapper;

/**
 * MyBatis配置多数据源
 * 使用SpringAOP方式实现自动切换
 * @author Administrator
 * @创建日期 2016.3.5
 */
@Component
@Aspect
public class MultipleDataSourceAspectAdvice 
{
    @Around("execution(* com.github.clbxg.*.*(..))")
    public Object doAround(ProceedingJoinPoint jp) throws Throwable 
    {
        if (jp.getTarget() instanceof MySqlMapper) 
        {
            MultipleDataSource.setDataSourceKey("mySqlDataSource");
        } 
        else if (jp.getTarget() instanceof SqlServerMapper) 
        {
            MultipleDataSource.setDataSourceKey("sqlServerDataSource");
        }
        return jp.proceed();
    }
}
