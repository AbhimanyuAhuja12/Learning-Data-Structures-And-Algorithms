package AdvQues;

import java.util.ArrayList;

public class DiceRollsWithTargetSum {
    public static void main(String[] args) {
//        DiceSum("", 4);
//        System.out.println(DiceSumRet("",5));
        System.out.println(diceSumCount("",10,6));
    }

    public static void DiceSum(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6; i++) {
            if (i <= target) {
                DiceSum(p + i, target - i);
            }
        }
    }

    public static  ArrayList<String> DiceSumRet(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= 6; i++) {
            if (i <= target) {
                list.addAll(DiceSumRet(p+i,target-i));
            }
        }return list;
    }
    public static int diceSumCount(String p, int target, int faces) {
        if (target == 0) {
            return 1;
        }
        int count=0;


        for (int i = 1; i <= faces; i++) {
            if (i <= target) {
                count=count + diceSumCount(p+i,target-i,faces);
            }
        }return count;
    }

}


