package Inheritance;

public class BoxWeight extends Box{
    int weight=25;

    public void weight(){
        System.out.println("weight-subclass");
    }


    @Override
      public void greeting(){
        System.out.println("Child class");


    }

}
