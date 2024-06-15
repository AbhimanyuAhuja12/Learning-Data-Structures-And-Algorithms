public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr={2,2,3,2,7,7,8,7,8,8};
        System.out.println(duplicateThreeTimes(arr));
//        Arrays.sort(arr);
//        int i=0;
//        while(i<arr.length){
//            if(arr[i]!=arr[i+1]){
//                i++;
//            }else{
//                System.out.println(arr[i]);
//                return;
//            }
//        }
    }
    public static String duplicateThreeTimes(int[]arr){
        int sum=0;
        for(int n: arr){
            sum+=n;
        }
        System.out.println(sum);

        return Integer.toBinaryString(sum) ;
    }
}
