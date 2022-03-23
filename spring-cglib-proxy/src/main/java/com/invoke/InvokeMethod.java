package com.invoke;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class InvokeMethod {
    public static void main(String[] args) throws Exception {
        User user = new User("tanx");
        Class clazz = Class.forName("com.invoke.User");
        Method method = clazz.getDeclaredMethod("process", String.class);
        method.setAccessible(true);
        method.invoke(user, "tanlm");

        Field field = clazz.getDeclaredField("name");
        field.setAccessible(true);
        field.set(user, "tanxx");
        System.out.println(user.getName());
    }
}
