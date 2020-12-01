package com.gz.jvm.runtimedata.jvmstack;

public class stackTest2 {
    public static void main(String[] args) {
        stackTest2 s = new stackTest2();
        s.m5();
    }

    void m1(){
        int m=10;
        double n=20.0;
        double k=m2(m,n);
    }

    double m2(int a,double b){
        double c=a+b;
        return c;
    }

    void m3(){
        int m=10;
        int n=20;
        int k=m4(m,n);
    }

    int m4(int a,int b){
        int c=a+b;
        return c;
    }
    void m5(){
        int a=10;
        int b=a++;
        System.out.println(b);
        int c=++a;
        System.out.println(c);

    }
}

