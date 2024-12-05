package Abstraction;

public class Child2 {
    public static void main(String[] args) {
        Parent daughter = new Parent() {

            void career() {
                System.out.println("daughter's career");
            }


            void partner() {
                System.out.println("Abhimanyu ahuja");
            }
        };
    }


}
