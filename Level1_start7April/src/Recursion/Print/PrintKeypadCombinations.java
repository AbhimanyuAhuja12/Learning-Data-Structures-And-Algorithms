package Recursion.Print;

import java.util.Scanner;

public class PrintKeypadCombinations {
    static String[] arr = {"?!", "abc", "def", "ghi", "jkl", "mnop", "qrst", "uv", "wxyz", ".;"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneNo = scanner.next();

        getKeypadCombinations(phoneNo, "");
    }

    private static void getKeypadCombinations(String phoneNo, String current) {
        if (phoneNo.length() == 0) {
            System.out.println(current);
            return;
        }
        char ch = phoneNo.charAt(0);
        String rem = phoneNo.substring(1);

        String number = arr[ch - '0'];
        for (int i = 0; i < number.length(); i++) {
            getKeypadCombinations(rem, current + number.charAt(i));
        }

    }
}
