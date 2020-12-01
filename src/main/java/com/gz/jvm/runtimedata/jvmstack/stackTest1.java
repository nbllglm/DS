package com.gz.jvm.runtimedata.jvmstack;

public class stackTest1 {
    public static void main(String[] args) {
            stackTest1 stackTest1=new stackTest1();
            stackTest1.method1();
    }
    void method1(){
        int a=10;
        int b=20;
        method2();
    }
    void method2(){
        int k=30;
        int j=40;
    }
    void method3(){
    }
}
