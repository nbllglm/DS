package com.gz.test;

public class Test3 {
    void print() {
        System.out.println("Test======" + this.getClass().getName());
    }

    class A {
        void print() {
            System.out.println("A======" + this.getClass().getName());
        }
    }

    static class B {
        void print() {
            System.out.println("B======" + this.getClass().getName());
        }
    }

    public static void main(String[] args) {
//        Test3 test3 = new Test3();
//        A a =  test3.new A();
//        B b=new Test3.B();
//        test3.print();
//        a.print();
//        b.print();
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(0x0011);
        System.out.println(-1>>28);
        System.out.println(-1>>>28);

        for (int binCount = 0; binCount<20; ++binCount) {
            System.out.println(binCount);
        }
    }
}
