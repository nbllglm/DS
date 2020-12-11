package com.gz.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution {



    public static void main(String[] args) {
        int count=0;
       int a=5;
       String aa=Integer.toBinaryString(a);
       char [] asd=aa.toCharArray();
        for (int i = 0; i < asd.length; i++) {
            if(Integer.parseInt(asd[i]+"")==1){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
