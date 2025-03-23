package Generics;

import java.util.ArrayList;

public class ArrayListChecker {
    public static void main(String[] args) throws MyException {
//        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.set(9,45);
//        System.out.println(list2);


        CustomArrayList list = new CustomArrayList();
        list.add(23);
        list.add(56);
        list.add(89);
        list.add(2);
        list.add(6);
        list.add(9);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(23);
        list.add(56);
        list.add(89);
        list.add(2);
        list.add(6);
//        list.add(9);
//        list.add(3);
//        list.add(5);
//        list.add(8);

        System.out.println(list);
        list.remove();
        list.remove();

        System.out.println(list.size());
        System.out.println(list);
//        System.out.println(list.get(5));
//        list.set(24,99);
//        System.out.println(list);


        CustomGenericArrayList dynamicList = new CustomGenericArrayList();
        dynamicList.add("abhimanyu");
        dynamicList.add(12);
        dynamicList.add(20.03);
        System.out.println(dynamicList);
        CustomGenericArrayList <String> dynamicStringlist = new CustomGenericArrayList<>();
        dynamicStringlist.add("hello");
        dynamicStringlist.add("how");
        dynamicStringlist.add("are");
        dynamicStringlist.add("you ?");
        System.out.println(dynamicStringlist);



    }
}
