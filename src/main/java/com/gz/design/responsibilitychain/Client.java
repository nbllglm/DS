package com.gz.design.responsibilitychain;

public class Client {
    public static void main(String[] args) {
        Handler handler1 = new AHandler();
        Handler handler2 = new BHandler();
        Handler handler3 = new CHandler();

        handler1.setHandler(handler2);
        handler2.setHandler(handler3);
        Request request = new Request(205);
        handler1.ProcessRequest(request);
    }
}
