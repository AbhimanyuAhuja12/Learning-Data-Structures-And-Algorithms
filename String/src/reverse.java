public class reverse {
    public static void main(String[] args) {
        String str="my name is abhimanyu ahuja";
        char[]arr=str.toCharArray();
        reverse2(arr);
        System.out.println(arr);
    }public static void reverse(char[] arr, int start , int end){
//        int start=0;
//        int end=arr.length-1;
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void reverse2(char[]arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=' ';
            reverse(arr,,i);
        }
    }
}
