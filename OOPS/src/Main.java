import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student one = new Student();
        Student two = one;
        one.Name = "Abhimanyu Ahuja";

        System.out.println(two.Name);
        two.Name="Kashish Ahuja";
        System.out.println(one.Name);


        String str1="hello";
        String str2= new String("hello");
        if(str1==str2) System.out.println("they are equal");else System.out.println("they are not equal");

        


    }
}

    class Student{
        int rollNo;
        float marks;
        String Name;

//        Student(){
//            this.rollNo=rollNo;
//            this.Name=Name;
//        }

}