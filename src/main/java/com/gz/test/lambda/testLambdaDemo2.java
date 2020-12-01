package com.gz.test.lambda;

import java.util.Comparator;

public class testLambdaDemo2 {
    public static void main(String[] args) {
      //  size(3, 5, "-").yunsuan();
      System.out.println(getasd().compare("qqq","aaa"));
    }

    static Comparator<String> getasd() {
        return (String o1, String o2) -> o1.length() - o2.length();
    }

    static testLambda2 size(int a, int b, String f) {
        switch (f) {
            case "+":
                return () -> {
                    System.out.println(a + b);
                };

            case "-":
//                return () -> {
//                    System.out.println(a - b);
//                };
                return new testLambda2() {
                    @Override
                    public void yunsuan() {
                        System.out.println(a - b);
                    }
                };
            case "*":
                return () -> {
                    System.out.println(a * b);
                };

            case "/":
                return () -> {
                    System.out.println(a / b);
                };
            default:
                break;
        }
        return null;
    }
}
