package questions.src.questions;

public class NoOfDigitsinBinary {

    public static void main(String[] args) {
        int n=8;
        int base =2;

//        int ans = (int)(Math.log(n)/Math.log(base)) +1;
//        System.out.println(ans);

        int count =0;
        while(n>0){
            count++;
            n=n>>1;

        }
        System.out.println(count);
    }
}
