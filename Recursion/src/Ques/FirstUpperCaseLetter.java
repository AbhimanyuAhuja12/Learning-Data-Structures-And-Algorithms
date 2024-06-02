package Ques;
//First uppercase letter in a string (Iterative and Recursive)

public class FirstUpperCaseLetter {
    public static void main(String[] args) {
        String str = "geeksfogeeKs";

        System.out.println(UpperCaseLetter(str, 0));


    }

    static char UpperCaseLetter(String str, int n) {
        if (Character.isUpperCase(str.charAt(n))) {
//            return UpperCaseLetter(str, n + 1);
            return str.charAt(n);
        }

        return UpperCaseLetter(str, n + 1);
    }
}
