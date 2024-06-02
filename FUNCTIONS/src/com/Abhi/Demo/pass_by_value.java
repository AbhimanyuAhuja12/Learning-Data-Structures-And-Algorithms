package com.Abhi.Demo;

public class pass_by_value {
    public static void main(String[] args) {
        String naam="abhimanyu";
        change_name(naam);
        System.out.println(change_name(naam));

    }

     static String change_name(String naam) {
        naam="rahul";
        return naam;
    }
}
