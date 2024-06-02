package AdvQues;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
//        System.out.println(subSeq("","abc",new ArrayList<>()));
        System.out.println(subSeq3("","abc"));
    }
    public static void subSeq(String ans , String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch =str.charAt(0);

        subSeq(ans,str.substring(1));
        subSeq(ans+ch ,str.substring(1));
    }
    public static ArrayList<String> subSeq2(String ans , String str, ArrayList<String> List){
        if(str.isEmpty()){
            List.add(ans);
            return List;
        }
        char ch =str.charAt(0);

        subSeq2(ans,str.substring(1),List);
        subSeq2(ans+ch ,str.substring(1),List);
        return List;
    }
    public static ArrayList<String> subSeq3(String ans , String str){
        if(str.isEmpty()){
            ArrayList<String> List =new ArrayList<>();
            List.add(ans);
            return List;
        }
        char ch =str.charAt(0);

        ArrayList <String> Left = subSeq3(ans,str.substring(1));
        ArrayList <String> Right = subSeq3(ans+ch ,str.substring(1));

        Left.addAll(Right);
        return Left;
    }
}
