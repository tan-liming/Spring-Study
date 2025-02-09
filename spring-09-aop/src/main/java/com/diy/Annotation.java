package com.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect  //标注这个类是一个切面
public class Annotation {

    @Before("execution(* com.service.UserServiceImp.*(..))")
    public void before(){
        System.out.println("注解之前");
    }

    @After("execution(* com.service.UserServiceImp.*(..))")
    public void after(){
        System.out.println("注解之后");
    }

    //在环绕增强中，我们可以给地暖管一个参数，代表我们要获取切入的点
    @Around("execution(* com.service.UserServiceImp.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("注解环绕");

        //获得签名
        System.out.println("签名:" + joinPoint.getSignature());
        //执行方法
        Object proceed = joinPoint.proceed();

        System.out.println("注解环绕之后");
    }

}
