package ComparingObjects;

import java.util.Arrays;

public class Helper {
    public static void main(String[] args) {
        Student kunal = new Student(89,4);
        Student Rahul = new Student(73,9);
        Student arpit = new Student(2, 95.52f);
        Student karan = new Student(13, 77.52f);
        Student sachin = new Student(9, 96.52f);

        System.out.println(kunal.compareTo(Rahul));

        Student[] list = {kunal, Rahul, arpit, karan, sachin};


        System.out.println(Arrays.toString(list));



    }
}
