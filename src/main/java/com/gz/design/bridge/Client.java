package com.gz.design.bridge;

public class Client {


    public static void main(String[] args) {
        Oppo oppo=new Oppo();
        FoldedPhone foldedPhone=new FoldedPhone(oppo);
        foldedPhone.open();
        foldedPhone.call();
        foldedPhone.close();

    }
}
