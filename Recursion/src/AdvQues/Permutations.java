package AdvQues;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        char[]arr ={'a','b','c'};
        List<List<Character>>ans = new ArrayList<>();
        boolean[]freq = {false,false,false};
//        findPermutations(arr, new ArrayList<>(),ans,freq);
//        System.out.println(ans);
        findPermutations2(0,arr,ans);
        System.out.println(ans);

    }
    public static void findPermutations(int[]arr, List<Integer>curr,List<List<Integer>> ans , boolean[]freq){
        if(curr.size()==arr.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if(freq[i]==false){
                curr.add(arr[i]);
                freq[i]=true;
                findPermutations(arr,curr,ans,freq);
                curr.remove(curr.size()-1);
                freq[i]=false;
            }
        }
    }


    public static void findPermutations2(int index, char[]arr, List<List<Character>>ans) {
        // base condition
        if(index==arr.length){
            List<Character> curr = new ArrayList<>();
            for (int i = 0; i <arr.length ; i++) {
                curr.add(arr[i]);
            }
            ans.add(new ArrayList<>(curr));
        }

        for (int i = index; i <arr.length ; i++) {
            // swap
            swap(index,i,arr);
            findPermutations2(index+1,arr,ans);
            swap(index,i,arr);
        }
    }
    public static void swap(int first , int second, char[]arr){
        char temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}