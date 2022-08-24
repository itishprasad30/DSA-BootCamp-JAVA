package itish.Interfaces;

public class CdPlayer implements MediaPlayer{


    @Override
    public void start() {
        System.out.println("Music Start");
    }

    @Override
    public void stop() {
        System.out.println("Music Stops");
    }
}
