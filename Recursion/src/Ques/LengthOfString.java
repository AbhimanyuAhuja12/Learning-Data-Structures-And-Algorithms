package Ques;

public class LengthOfString {
    public static void main(String[] args) {
        String a= "GEEKS";
        System.out.println(StringLength(a));
    }
    static int StringLength(String str) {
        if(str.equals("")){
            return 0;
        }
        else{
            return StringLength(str.substring(1))+1;
        }
    }
}
