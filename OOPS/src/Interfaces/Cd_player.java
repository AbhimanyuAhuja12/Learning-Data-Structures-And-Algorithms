package Interfaces;

public class Cd_player implements Media{
    @Override
    public void start() {
        System.out.println("Music player Starts");
    }

    @Override
    public void stop() {
        System.out.println("Music Player stops");
    }
}
