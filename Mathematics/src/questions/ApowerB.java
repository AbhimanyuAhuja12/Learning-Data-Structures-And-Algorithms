package questions;

public class ApowerB {
    public static void main(String[] args) {
        // base**n
//        int base =5;
//        int n=4;
//        int ans=1;
//        while(n>0){
//            int last = n & 1;
//            if(last ==0){
//                base=base*base;
//                n=n>>1;
//            }else{
//                ans=ans*base;
//                base=base*base;
//                n=n>>1;
//            }
//        }
//        System.out.println(ans);

        int power =6;
        int base =3;
        int ans =1;
        while(power>0){
            if((power & 1)==1){
                ans*=base;
            }
            base*=base;
            power >>=1;
        }
        System.out.println(ans);
    }
}
