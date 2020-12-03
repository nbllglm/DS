package com.gz.design.prototype;

import java.io.Serializable;

public class DeepClonetarget implements Serializable,Cloneable {
    private static final long serialVersionUID = -9048782466831302125L;
    private String cloneName;
    private String cloneClass;

    public DeepClonetarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
