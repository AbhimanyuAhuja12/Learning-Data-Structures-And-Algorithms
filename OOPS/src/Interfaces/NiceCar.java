package Interfaces;

public class NiceCar implements Brakes {

    private Engine engine;
    private Media player;



    public NiceCar(){
        this.engine= new PowerEngine();
        this.player= new Cd_player();
    }

    public NiceCar(Engine engine){
        this.engine=engine;
        this.player= new Cd_player();
    }

    public void startEngine(){
        engine.start();
    }


    public void stopEngine(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }

    public void upgradeEngine(){
        this.engine= new ElectricEngine();
    }

    public void stopMusic(){
    player.stop();
    }

    public void speedUp(){
        engine.acc();
    }

    @Override
    public void brake() {
        System.out.println("Brakes applied");
    }
}
