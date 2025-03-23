package Interfaces;

public class Checker {
    public
    static void main(String[] args) {
        NiceCar lambo = new  NiceCar();


        lambo.startEngine();
        lambo.speedUp();
        lambo.brake();
        lambo.startMusic();
        lambo.stopMusic();
        lambo.stopEngine();
        lambo.upgradeEngine();
        lambo.speedUp();
        lambo.brake();
        lambo.stopEngine();
    }
}
