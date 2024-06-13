import java.util.Arrays;

public class NoIsUniqueOrNot {
    public static void main(String[] args) {
        int[]arr ={1,2,3,4,5,4,2,1,5};
//        System.out.println(UniqueNo(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int ans=-1;
        for (int i = 1; i <arr.length ; i=i+2) {
            if(arr[i-1]!=arr[i]){
              ans = arr[i-1];
        }
        }
        System.out.println(ans);
    }public static int UniqueNo(int[]arr){
        int unique=0;
        for(int n: arr){
            unique^=n;
        }return unique;
    }
}
