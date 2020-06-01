package com.penny;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * jdk1.6
 * VM Args: -XX:PermSize=10m -XX:MaxPermSize=10m
 * @author &lt;a href="mailto:Answer1331@163.com"&gt;Lambda&gt;/a&lt;
 * @date 2020/06/01
 * @since
 */
public class JavaMethodAreaOOM {
    public static void main(String[] args) {
        while (true) {
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(HeapOOM.OOMObject.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
                @Override
                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                    return methodProxy.invokeSuper(objects, objects);
                }
            });
        }
    }
}
