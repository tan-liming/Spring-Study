package com.invoke;

import java.lang.reflect.Method;

public class PersonInvoke {
    public static void main(String[] args) throws Exception {
        Person person = new Chinese();
        Class clazz = Class.forName("com.invoke.Person");
        Method method = clazz.getDeclaredMethod("eat", String.class);
        method.setAccessible(true);
        method.invoke(person, "noodles");
    }
}
