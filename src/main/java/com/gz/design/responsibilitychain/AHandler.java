package com.gz.design.responsibilitychain;

public class AHandler extends Handler {
    @Override
    public void ProcessRequest(Request request) {
        if (request.getPrice() > 0 && request.getPrice() <= 100) {
            System.out.println(getClass().getName());
        } else {
            getHandler().ProcessRequest(request);
        }
    }
}
