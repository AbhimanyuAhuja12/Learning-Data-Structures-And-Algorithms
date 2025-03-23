package Inheritance;
import Encapsulation.Class1;

import java.lang.String;

public class Main extends Class1 {
    public static void main(String[] args) {
        Box b = new BoxWeight();
        b.greeting();
        b.width();
        System.out.println(b.hashCode());


//        b.weight();  //not allowed

      // to access protected variable , i have to access it from its subclass only
        Main obj = new Main();
        System.out.println(obj.result);

    }
}
