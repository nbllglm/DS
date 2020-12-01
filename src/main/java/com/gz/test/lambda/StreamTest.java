package com.gz.test.lambda;

import com.gz.test.Person;
import com.gz.test.Student;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("a", 1, "男"));
        personList.add(new Person("b", 3, "男"));
        personList.add(new Person("c", 12, "女"));
        personList.add(new Person("d", 16, "女"));
        personList.stream()
                .filter(person -> {
                    if ("女".equals(person.getSex()))  {
                        return true;
                    }
                    return false;
                })
                .map(person -> {
                    Student student=new Student();
                    student.setName(person.getName());
                    return  student;
                })
                .forEach(person -> System.out.println(person));
    }
}
