package com.tanlm;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class AccountAdvice implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        return methodProxy.invokeSuper(o, objects);
        //return methodProxy.invoke(o, objects);
    }

    public void before(){
        System.out.println("增加的前置服务");
    }
}
