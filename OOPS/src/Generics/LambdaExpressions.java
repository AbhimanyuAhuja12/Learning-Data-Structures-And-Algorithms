package Generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExpressions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);

        }
//        for (int i:list
//             ) {
//            System.out.print(i*2 +" ");
//
//        }
        //lamda expression
//        list.forEach((item)-> System.out.println(item*3));


        Consumer<Integer> fun =(j)-> System.out.println(j*2);
       list.forEach(fun);

//        System.out.println();

//        System.out.println(list);
    }
}
