package Abstraction;

public class Runner {
    public static void main(String[] args) {
        Son son= new Son(30);
        Parent daughter = new Daughter(21);
        System.out.println(daughter.age);

        System.out.println(daughter.VALUE);
        System.out.println(son.VALUE);

//        daughter.helper(); // can't run


        son.career();
        daughter.career();

    }
}
