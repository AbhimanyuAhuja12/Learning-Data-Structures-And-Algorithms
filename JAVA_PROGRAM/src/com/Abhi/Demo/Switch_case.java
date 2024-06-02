//Syntax of switch case statements
//switch(expression){
//    case 1:
////        code
//
//break
//    case2:
////        code
//        break;
//case3:
////        code
//        break
//        default:
















package com.Abhi.Demo;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
//        String fruit = input.next();
//
//        switch (fruit) {
//            case "mango" -> System.out.println("king of fruits ");
//            case "grapes" -> System.out.println("sweetest fruit");
//            case "apple" -> System.out.println("round fruit");
//            default -> System.out.println("enter valid fruit name");
//        }
//    }}
//}
//
// nested switch
        int Emp_id = input.nextInt();
        String department = input.next();
        switch (Emp_id) {
            case 1 -> System.out.println("employee 1");
            case 2 -> System.out.println("employee 2");
            case 3 -> {
                System.out.println("emp no.3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "management" -> System.out.println("hr");
                    case "finance" -> System.out.println("paisa");
                    default -> System.out.println("you are not a employee of this company");
                }
            }
            default -> System.out.println("not a employee");


//        System.out.println("enter the day number(1-7)");
//        int days =input.nextInt();
//        switch (days){
//            case 1, 2, 3 ,4, 5->{
//                System.out.println("weekday");
//
//            }
//            case 6 ,7->{
//                System.out.println("weekend");
//            }
//            default-> System.out.println("enter a valid day ");
        }
    }
}
