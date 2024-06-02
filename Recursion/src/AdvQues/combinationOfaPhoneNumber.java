package AdvQues;

import java.util.ArrayList;

public class combinationOfaPhoneNumber {
    public static void main(String[] args) {
        System.out.println(PhonePadRet("","1234"));
//        System.out.println(PhonePadCount("","123"));
    }
    public static void PhonePad(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        int digit =up.charAt(0)-'0';

        for (int i = (digit-1)*3; i <digit*3 ; i++) {

            char ch =(char)('a'+i);

            PhonePad(p+ch,up.substring(1));
        }
    }

    public static ArrayList<String> PhonePadRet(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit =up.charAt(0)-'0';
        ArrayList<String> internalList =new ArrayList<>();
        for (int i = (digit-1)*3; i <digit*3 ; i++) {
             if(i==26){
                 continue;
             }
            char ch =(char)('a'+i);

            internalList.addAll(PhonePadRet(p+ch,up.substring(1)));
        }
        return internalList;
    }
    public static int PhonePadCount(String p , String up){
        if(up.isEmpty()){
            return 1;
        }
        int count =0;
        int digit =up.charAt(0)-'0';
        ArrayList<String> internalList =new ArrayList<>();
        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            if(i==26){
                continue;
            }
            char ch =(char)('a'+i);

            count =count + PhonePadCount(p+ch,up.substring(1));
        }
        return count;
    }
}
