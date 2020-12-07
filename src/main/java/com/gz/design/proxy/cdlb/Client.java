package com.gz.design.proxy.cdlb;

public class Client {
    public static void main(String[] args) {
        Teacher teacher1=new Teacher();
        ProxyFactory proxyFactory=new ProxyFactory(teacher1);
        Teacher teacher2= (Teacher) proxyFactory.getInstance();
        teacher2.asd(2);
    }
}
