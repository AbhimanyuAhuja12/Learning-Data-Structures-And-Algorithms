package Abstraction;

public  abstract class Parent {

    int age=5;
    final  int VALUE;
    public Parent(int age){
        this.age=age;
        this.VALUE=12345678;
    }

    abstract void  career();

    abstract void  partner();



    void normal(){
        System.out.println("Normal method in abstract parent class");
    }

   
}
