package com.gz.design.oberserver;

public interface Subject {
    void regsisterObsserver(Observer o);

    void removeObsserver(Observer o);

    void notifyObsserver();
}
