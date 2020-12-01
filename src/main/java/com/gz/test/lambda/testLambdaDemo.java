package com.gz.test.lambda;

public class testLambdaDemo {

    static void asd(testLambda testLambda, int q, int w) {
        System.out.println("究极套娃===" + testLambda.test1(q, w));
    }

    public static void main(String[] args) {
        Long startTime = System.currentTimeMillis();
//        asd(((a, b) -> {
//            System.out.println("test1.a==" + a + "   " + "test.b==" + b);
//            return a + b;
//        }), 1, 2);

        asd(new testLambda() {
            @Override
            public int test1(int a, int b) {
                System.out.println("test1.a==" + a + "   " + "test.b==" + b);
            return a + b;
            }
        },1,2);
       // asd(new testLambdaImpl(),1,2);
        Long endTime = System.currentTimeMillis();
        Long tempTime = (endTime - startTime);
        System.out.println("花费时间："+
                (((tempTime/86400000)>0)?((tempTime/86400000)+"d"):"")+
                ((((tempTime/86400000)>0)||((tempTime%86400000/3600000)>0))?((tempTime%86400000/3600000)+"h"):(""))+
                ((((tempTime/3600000)>0)||((tempTime%3600000/60000)>0))?((tempTime%3600000/60000)+"m"):(""))+
                ((((tempTime/60000)>0)||((tempTime%60000/1000)>0))?((tempTime%60000/1000)+"s"):(""))+
                ((tempTime%1000)+"ms"));
    }

}
