package com.gz.test.ddz;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Player {
    private Set<Pok> pokList=new HashSet<>();

    protected boolean remove(List<Pok> chupai) throws NullPointerException {
        boolean flag = false;
        if (Main.NoNull(chupai)) {
            for (Pok pok : chupai) {
                if (pokList.contains(pok)) {
                    flag = pokList.remove(pok);
                }
            }
        }
        return flag;
    }

    protected boolean add(Pok pok) throws NullPointerException {
        if (pok != null) {
            return pokList.add(pok);
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer=new StringBuffer();
        for (Pok pok:pokList){
            stringBuffer.append(pok+" ");
        }
        return  stringBuffer.toString();
    }
}
