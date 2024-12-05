package Abstraction;

public class Child1 {
    public static void main(String[] args) {
        Parent son = new Parent() {
            @Override
            void career() {
                System.out.println("Sons career ");
            }

            @Override
            void partner() {
                System.out.println("Kashish jain");
            }
        };
    }
}
