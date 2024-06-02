import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[]arr={-8,7,-32,56,0};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[]arr){
        boolean swapped=false;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length-i; j++) { //arr.length-i-1;
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }

            }if(!swapped){
                break;
            }
        }
    }
}
