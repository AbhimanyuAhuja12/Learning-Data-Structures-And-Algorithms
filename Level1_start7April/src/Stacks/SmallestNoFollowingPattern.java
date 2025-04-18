package Stacks;

import java.util.Scanner;
import java.util.Stack;


public class SmallestNoFollowingPattern {

    public static StringBuilder ans = new StringBuilder();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pattern = input.next();

        Stack<Integer> stack = new Stack<>();
        int num=1;
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);

            if (ch == 'D') {
                stack.push(num);
                num++;
            }else{
                stack.push(num);
                num++;

                while(!stack.isEmpty()){
                    System.out.print(stack.pop());
                }
            }
        }
        stack.push(num);
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }

//    public static StringBuilder findSmallest(String pattern, String potential, int ptr) {
//        if (ptr == pattern.length()) {
//            ans.append(potential);
//            return ans;
//        }
//        if (pattern.charAt(ptr) == 'I') {
//            int curr = potential.charAt(ptr) - '0';
//            int temp = curr + 1;
//            while (temp <= 9 && temp > curr) {
//                potential = potential + temp;
//                temp++;
//                findSmallest(pattern, potential, ptr++);
//        }
//
//        } else if (pattern.charAt(ptr) == 'D') {
//            int curr = potential.charAt(ptr) - '0';
//            int temp = curr - 1;
//            while (temp >= 1 && temp < curr) {
//                potential = potential + temp;
//                temp--;
//                findSmallest(pattern, potential, ptr++);
//
//            }
//        }
//
//        return ans;
//    }


}
