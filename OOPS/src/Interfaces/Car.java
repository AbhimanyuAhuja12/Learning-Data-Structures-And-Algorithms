package Interfaces;

public class Car implements Engine,Brakes,Media{


    @Override
    public void brake() {
        System.out.println("Brakes applied from Car class");
    }

    @Override
    public void start() {
        System.out.println("Engine Started");
    }

    @Override
    public void stop() {
        System.out.println("Engine stopped");
    }

    @Override
    public void acc() {
        System.out.println("accelerate- Boom Boom");
    }
}
