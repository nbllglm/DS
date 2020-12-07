package com.gz.design.responsibilitychain;

public abstract class Handler {
    private Handler handler;

    public abstract void ProcessRequest(Request request);

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
