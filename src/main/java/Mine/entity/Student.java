package Mine.entity;

import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(@NotNull Student o) {
        if (this.age < o.age) {
            return -1;
        } else if (this.age > o.age) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Student =  " + name + "  "+String.valueOf(age);
    }
}
