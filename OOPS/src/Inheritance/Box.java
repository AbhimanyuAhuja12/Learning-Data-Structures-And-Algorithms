package Inheritance;

import Polymorphism.child;

public class Box {

    int[] specs =new int[]{36,28,36};


    int width=3;
    int length=4;
    int breadth=4;

    public void width(){
        System.out.println("width-superclass");
    }

    public void greeting(){
        System.out.println("Parent class");
    }

    public static void main(String[] args) {
        child obj = new child();
    }
}



