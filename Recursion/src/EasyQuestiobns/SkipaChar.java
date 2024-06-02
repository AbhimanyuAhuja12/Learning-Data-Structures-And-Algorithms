package EasyQuestiobns;

public class SkipaChar {
    public static void main(String[] args) {
        String str="baccad";
        String result ="";
//        generating(str,result);
         String s=skip(str);
        System.out.println(s);
    }
    public static void generating(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch =str.charAt(0);

        if (ch == 'a') {
            generating(str.substring(1),ans);
        }else{
            generating(str.substring(1),ans+ch);
        }

    }
    public static String skip(String str){

        if(str.isEmpty()){
            return "";
        }
        char ch =str.charAt(0);

        if(ch=='a'){
           return skip(str.substring(1));
        }
        else{
            return  ch + skip(str.substring(1));
        }

    }
}
