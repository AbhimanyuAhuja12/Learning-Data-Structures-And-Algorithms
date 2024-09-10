package Neww_package.b;

public class main {
    static int a=21;
    public static void main(String[] args) {
        int x=10;
        String str="Abc";
        float y=1.23f;
        System.out.println(main.a);


    }



      static void runner(){
         System.out.println("Method is Running");
//         helper();
         System.out.println(main.a);
    }

    void helper(){
        System.out.println("helper function");
        runner();
    }

     void fun(){
        helper();
    }


}
