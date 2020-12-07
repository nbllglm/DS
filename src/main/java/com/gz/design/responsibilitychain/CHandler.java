package com.gz.design.responsibilitychain;

public class CHandler extends Handler {
    @Override
    public void ProcessRequest(Request request) {
        if (request.getPrice() > 200 && request.getPrice() <= 300) {
            System.out.println(getClass().getName());
        } else {
            getHandler().ProcessRequest(request);
        }
    }
}
