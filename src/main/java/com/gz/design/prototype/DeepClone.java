package com.gz.design.prototype;

import java.io.Serializable;

public class DeepClone implements Serializable, Cloneable {
    private static final long serialVersionUID = 5361883149962370883L;
    private String name;
    private DeepClonetarget deepClonetarget;

    public DeepClone(String name, DeepClonetarget deepClonetarget) {
        this.name = name;
        this.deepClonetarget = deepClonetarget;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepClone deepClone = (DeepClone) super.clone();
        deepClone.deepClonetarget = (DeepClonetarget) this.deepClonetarget.clone();
        return deepClone;
    }

    @Override
    public String toString() {
        return "DeepClone{" +
                "name='" + name + '\'' +
                ", deepClonetarget=" + deepClonetarget.hashCode() +
                '}';
    }
}
