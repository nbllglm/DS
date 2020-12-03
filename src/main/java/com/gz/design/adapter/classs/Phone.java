package com.gz.design.adapter.classs;

public class Phone {
    public static void main(String[] args) {
        VoltageAdapter voltageAdapter=new VoltageAdapter();
        Phone phone=new Phone();
        phone.charging(voltageAdapter);
    }
    void charging(Voltage5V v) {
        if (v.voutput5V() == 5) {
            System.out.println("ok");
        } else {
            System.out.println("wrong");
        }
    }
}
