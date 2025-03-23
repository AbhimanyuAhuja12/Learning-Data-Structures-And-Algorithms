package Polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        child obj = new child();
        System.out.println(obj.height);
        System.out.println(obj.toString());

        Parent obj2= new Parent();
        System.out.println(obj2.height);


//        child obj3 =new Parent();  // not possible
        Parent obj3 = new child();
        System.out.println(obj.height);
        obj3.status();

//        Arrays.sort();

//        ArrayList list = new ArrayList();
//        list.add("sfsf");
//        System.out.println(list);
    }
}
