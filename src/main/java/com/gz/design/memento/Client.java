package com.gz.design.memento;

public class Client {
    public static void main(String[] args) {
        Gamer gamer1 = new Gamer("A");
        gamer1.setVi(5);
        gamer1.setDef(10);
        Gamer gamer2 = new Gamer("B");
        gamer2.setVi(7);
        gamer2.setDef(6);
        caretaker caretaker = new caretaker();
        caretaker.setmemento(gamer1);
        caretaker.setmemento(gamer2);
        gamer1.restore(caretaker.getmemento(gamer1));
        gamer2.restore(caretaker.getmemento(gamer2));


    }
}
