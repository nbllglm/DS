package com.gz.design.prototype;

import java.io.*;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {


//        DeepClonetarget deepClonetarget = new DeepClonetarget("a", "1");
//        DeepClone deepClone = new DeepClone("A", deepClonetarget);
       // DeepClone deepClone1 = (DeepClone) deepClone.clone();


//        ByteArrayOutputStream byteArrayOutputStream;
//        byteArrayOutputStream=new ByteArrayOutputStream();
//        ObjectOutputStream outputStream=new ObjectOutputStream(byteArrayOutputStream);
//        outputStream.writeObject(deepClone);
//        ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
//        ObjectInputStream objectInputStream=new ObjectInputStream(byteArrayInputStream);
//        DeepClone deepClone1 = (DeepClone) objectInputStream.readObject();
//
//
//        System.out.println(deepClone.hashCode() + "  " + deepClone);
//        System.out.println(deepClone1.hashCode() + "  " + deepClone1);
//        System.out.println(deepClone == deepClone1);


        Sheep sheep = new Sheep("tom", 1, "white");
        Sheep friend = new Sheep("lili", 2, "black");
        sheep.setFriend(friend);
        Sheep sheep2=sheep.clone();
        Sheep sheep3=sheep.clone();
        Sheep sheep4=sheep.clone();
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);

//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream("asd.txt");
//            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
//            System.out.println(sheep);
//            outputStream.writeObject(sheep);
//
//
//            FileInputStream fileInputStream = new FileInputStream("asd.txt");
//            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//            Sheep sheep1 = (Sheep) objectInputStream.readObject();
//            System.out.println(sheep1);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }


    }


}
