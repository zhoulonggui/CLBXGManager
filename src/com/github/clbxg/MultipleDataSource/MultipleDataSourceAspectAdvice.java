package com.github.clbxg.MultipleDataSource;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.github.clbxg.Mapper.MySqlMapper;
import com.github.clbxg.Mapper.SqlServerMapper;

/**
 * MyBatis���ö�����Դ
 * ʹ��SpringAOP��ʽʵ���Զ��л�
 * @author Administrator
 * @�������� 2016.3.5
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
