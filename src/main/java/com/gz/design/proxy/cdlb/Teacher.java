package com.gz.design.proxy.cdlb;

import com.google.gson.Gson;

public class Teacher {
    public static void main(String[] args) {
        Gson gson=new Gson();
        String json=gson.toJson(new String("asdasdasdasdasd"));
        System.out.println(json);
    }
    void asd(int i){
        System.out.println(i+10);
    }
}
