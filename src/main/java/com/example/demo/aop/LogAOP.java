package com.example.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

@Aspect
@Component
public class LogAOP {
    @Around(value = "execution(* com.example.demo.service..*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object object = joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        long runTime = endTime - startTime;
        String targetName = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        System.out.println("——————————————————");
        System.out.println("类名："+targetName);
        System.out.println("方法名："+methodName);
        System.out.println("执行时间："+runTime);
        System.out.println("——————————————————");
        return object;
    }
}
