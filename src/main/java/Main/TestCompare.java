package Main;

import Mine.entity.Student;
import Mine.sort.BubbleSort;
import Mine.sort.SelectSort;

public class TestCompare {
    public static void main(String[] args) {
        Student student1 = new Student("A", 19);
        Student student2 = new Student("B", 23);
        System.out.println(getMax(student1, student2));
    }

    public static Comparable getMax(Comparable c1, Comparable c2) {
        int result = c1.compareTo(c2);
        if (result > 0) {
            return c1;
        } else {
            return c2;
        }
    }
}
