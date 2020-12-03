package com.gz.design.adapter.object;

public class VoltageAdapter implements Voltage5V {
    private Voltage220V v;

    public VoltageAdapter(Voltage220V v) {
        this.v = v;
    }

    @Override
    public int voutput5V() {
        if (v == null) {
            return 0;
        }
        int src = v.output220V();
        if (src == 220) {
            src = 5;
        }
        return src;
    }
}
