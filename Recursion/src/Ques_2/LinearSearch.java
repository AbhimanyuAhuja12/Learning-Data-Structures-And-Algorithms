package Ques_2;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {44, 66, 1, 23, 45, 89, 12, 44,34,61,44};
        int target = 44;
//        System.out.println(SearchPosition(arr, target, 0));
//        findIndexes(arr,44,0);
//        System.out.println(list);
        System.out.println(findIndexes3(arr, target, 0));

    }

    static int SearchPosition(int[] arr, int target, int index) {
        if (index > arr.length - 1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return SearchPosition(arr, target, index + 1);


    }

    // if you have multiple similar values, and you want to know all indexes of those values
//you can store it in arraylist seperately
     static ArrayList <Integer> list =new ArrayList <Integer> ();

    static void findIndexes(int[] arr, int target, int index) {
        if (index > arr.length - 1) {
            return ;
        }
        if (arr[index] == target) {
            list.add(index);
        }
         findIndexes(arr,target,index+1);
        }


    static ArrayList<Integer> findIndexes2(int[] arr, int target, int index, ArrayList <Integer> list) {
        if (index > arr.length - 1) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findIndexes2(arr,target,index+1,list);
    }


    static ArrayList<Integer> findIndexes3(int[]arr,int target,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index>arr.length-1){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls=findIndexes3(arr,target,index+1);

        list.addAll(ansFromBelowCalls);
        return list;
    }
}
