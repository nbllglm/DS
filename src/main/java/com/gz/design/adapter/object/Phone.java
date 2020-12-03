package com.gz.design.adapter.object;

public class Phone {
    public static void main(String[] args) {
        Voltage220V v = new Voltage220V();
        VoltageAdapter voltageAdapter = new VoltageAdapter(v);
        Phone phone = new Phone();
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
