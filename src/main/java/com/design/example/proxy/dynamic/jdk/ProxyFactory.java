package com.design.example.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName: ProxyFactory
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/24 18:11
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        Class<?> clazz = target.getClass();
        ClassLoader classLoader = clazz.getClassLoader();
        Class<?>[] interfaces = clazz.getInterfaces();
        InvocationHandler invocation = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("代理前...............");
                Object invoke = method.invoke(target, args);
                System.out.println("代理后...............");
                return invoke;
            }
        };
        Object instance = Proxy.newProxyInstance(classLoader, interfaces, invocation);
        return instance;
    }
}
