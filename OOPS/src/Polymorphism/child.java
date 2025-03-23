package Polymorphism;

public class child extends Parent{
    int weight=80;
    String name="Kunal";

    float height=5.6f;

    public void isGoodinStudies(){
        System.out.println("Good in studies");
    }

    public void status(){
        System.out.println("Child class");
    }

    @Override
    public String toString(){
        return "Our own toString Method";
    }
}
