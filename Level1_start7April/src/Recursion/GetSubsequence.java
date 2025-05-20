package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();

        System.out.println(getss(str));
    }
    private static ArrayList<String> getss(String str){
        //base condition
        if(str.length()==0){
            ArrayList<String> baseRes = new  ArrayList<>();
            baseRes.add(" ");
            return baseRes;

        }
        char ch = str.charAt(0);
        String helper = str.substring(1);
        ArrayList<String> curr = getss(helper);

        ArrayList<String> result = new ArrayList<>();
        for(String rstr : curr){
            result.add("" + rstr);
            result.add(ch + rstr);
            //here we are adding both the string at one go , we can do
            // it seperately to follow the particular order
        }
        return result;
    }
}
