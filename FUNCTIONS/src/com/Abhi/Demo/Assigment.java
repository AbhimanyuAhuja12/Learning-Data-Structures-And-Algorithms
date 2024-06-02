package com.Abhi.Demo;
//
import java.util.Scanner;
//
public class Assigment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks = input.nextInt();
        String ans= grade(marks);
        System.out.println(ans);
    }
//
//    static void grade(int marks) {
//        switch (marks) {
//            case '91'...'100' -> System.out.println("AA");
////            case (81 - 90) -> System.out.println("AB");
////            case (71 - 80) -> System.out.println("BB");
////            case (61 - 70) -> System.out.println("BC");
////            case (51 - 60) -> System.out.println("CD");
//            default -> System.out.println("fail");
//        }
//    }
//
//}


        public static String grade( int marks){
            String grade;
            switch (marks / 10) {
                case 10:
                case 9:
                    grade = "AA";
                    break;
                case 8:
                    grade = "AB";
                    break;
                case 7:
                    grade = "BB";
                    break;
                case 6:
                    grade = "BC";
                    break;
                case 5:
                    grade = "CD";
                    break;
                case 4:
                    grade = "DD";
                    break;
                default:
                    grade = "Fail";
                    break;
            }
            return grade;
        }
    }



