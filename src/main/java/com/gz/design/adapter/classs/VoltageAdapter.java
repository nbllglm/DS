package com.gz.design.adapter.classs;

public class VoltageAdapter extends Voltage220V implements Voltage5V{
    @Override
    public int voutput5V() {
        int src=output220V();
        if(src==220){
            src=5;
        }
        return src;
    }
}
