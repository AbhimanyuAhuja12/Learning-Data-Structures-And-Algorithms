import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[]arr={1,-32,-56,-43,7,0,1,0};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }static void selection(int []arr){
        for (int i = 0; i <arr.length; i++) {
            int last=arr.length-i-1;
            int max_index=max_element_index(arr,0,last);
            swap(arr,max_index,last);

        }
    }

    static int max_element_index(int[] arr, int start, int last) {
     int max=start;
        for (int j = start; j <=last; j++) {
            if(arr[j]>arr[max]){
                max=j;
            }

        }return max;
    }


    static void swap(int[]arr ,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
