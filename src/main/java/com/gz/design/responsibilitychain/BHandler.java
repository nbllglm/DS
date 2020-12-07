package com.gz.design.responsibilitychain;

public class BHandler extends Handler {
    @Override
    public void ProcessRequest(Request request) {
        if (request.getPrice() > 100 && request.getPrice() <= 200) {
            System.out.println(getClass().getName());
        } else {
            getHandler().ProcessRequest(request);
        }
    }
}
