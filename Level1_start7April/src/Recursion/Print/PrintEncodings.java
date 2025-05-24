package Recursion.Print;

import java.util.Scanner;

public class PrintEncodings {
    static String[] mapping = {"", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        printEncodings3(input,"");
    }
    private static void printEncodings1(String remaining , String current){
        if(remaining.length()==0){
            System.out.println(current);
            return;
        }
          for(int i =0 ;i<remaining.length();i++){
              String ssf = remaining.substring(0,i+1);
              String nextRemaining = remaining.substring(i+1);

              int ptr = Integer.parseInt(ssf);
              if(ptr<26 && ptr>0) {
                  printEncodings1(nextRemaining, current + mapping[ptr]);
              }
          }
    }
    private static void printEncodings2(String remaining, String current) {
        if (remaining.length() == 0) {
            System.out.println(current);
            return;
        }

        // One-digit possibility
        char firstChar = remaining.charAt(0);
        if (firstChar != '0') { // Skip '0' since there's no mapping
            int oneDigit = firstChar - '0';
            printEncodings2(remaining.substring(1), current + mapping[oneDigit]);
        }

        // Two-digit possibility
        if (remaining.length() >= 2) {
            int twoDigit = Integer.parseInt(remaining.substring(0, 2));
            if (twoDigit >= 10 && twoDigit <= 26) {
                printEncodings2(remaining.substring(2), current + mapping[twoDigit]);
            }
        }
    }
    private static void printEncodings3(String ques , String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        else if(ques.length()==1){
            char ch = ques.charAt(0);
            int chv = ch -'0';
            if(chv<=0){
                return;
            }else {
                char code = (char) ('a' + chv - 1);
                System.out.println(ans + code);
            }
        }else{
            char ch = ques.charAt(0);
            int chv = ch - '0';
            if(chv<=0){
                return;
            }else{
                char code = (char) ('a' + chv - 1);
                String remStr = ques.substring(1);
                printEncodings3(remStr,ans+code);
            }
            String ch12 = ques.substring(0,2);
            String remStr = ques.substring(2);
            int n12 = Integer.parseInt(ch12);
            char code = (char)('a'+ n12 -1 );
            printEncodings3(remStr,ans+ code);
        }
    }

    private static void printEncodings4(String input, String output) {
        // Base case: when the input is fully processed
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }

        // Single character processing
        char firstChar = input.charAt(0);
        if (firstChar == '0') {
            // No encoding for '0'
            return;
        }

        // Convert single digit to character and recurse
        int digit = firstChar - '0';
        char singleChar = (char) ('a' + digit - 1);
        printEncodings4(input.substring(1), output + singleChar);

        // Two character processing (only if at least two chars are available)
        if (input.length() >= 2) {
            String firstTwoChars = input.substring(0, 2);
            int num = Integer.parseInt(firstTwoChars);

            if (num >= 10 && num <= 26) {
                char twoDigitChar = (char) ('a' + num - 1);
                printEncodings4(input.substring(2), output + twoDigitChar);
            }
        }
    }

}

