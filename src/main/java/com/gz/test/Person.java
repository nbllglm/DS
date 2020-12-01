package com.gz.test;

import org.jetbrains.annotations.NotNull;

import java.io.*;

public class Person implements Comparable, Serializable {

    //    public static void main(String[] args) throws Exception{
//        File file = new File("asd.txt");
//        if (!file.exists()) {
//            file.createNewFile();
//        }
//        FileWriter fileWriter = new FileWriter(file);
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        bufferedWriter.write("qwertyuyui");
//        bufferedWriter.newLine();
//        bufferedWriter.write("asdfghghjjlkl");
//        bufferedWriter.newLine();
//        bufferedWriter.write("zxcvbvbnnmm");
//        bufferedWriter.newLine();
//        bufferedWriter.flush();
//        bufferedWriter.close();
//    }
    private static final long serialVersionUID = 123L;
    String name;
    int age;
    String sex;

    public Person() {
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(@NotNull Object o) {
        if (o instanceof Person) {
            Person person = (Person) o;
            if (age >= person.getAge()) {
                return 1;
            } else {
                return -1;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private void readObject(ObjectInputStream inputStream) throws Exception {
        this.name = inputStream.readUTF();
        this.age = inputStream.readInt();

    }

    private void writeObject(ObjectOutputStream outputStream) throws Exception {
        outputStream.writeUTF(this.name);
        outputStream.writeInt(this.age);
    }

}
