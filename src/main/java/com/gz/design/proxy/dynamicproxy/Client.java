package com.gz.design.proxy.dynamicproxy;

public class Client {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.setName("AAA");
        Teacher teacher2=new Teacher();
        teacher2.setName("BBB");


        ITeacher proxyInstance = (ITeacher) new ProxyFactory(teacher1).getinstance();
        proxyInstance.teach();
        proxyInstance.sayhello();
    }
}
