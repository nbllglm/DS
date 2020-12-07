package com.gz.design.proxy.cdlb;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {
    private Object object;

    public ProxyFactory(Object object) {
        this.object = object;
    }

    public Object getInstance() {
        Enhancer enhance=new Enhancer();
        enhance.setSuperclass(object.getClass());
        enhance.setCallback(this);
        return enhance;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object o1=method.invoke(o,objects);
        return o1;
    }
}
