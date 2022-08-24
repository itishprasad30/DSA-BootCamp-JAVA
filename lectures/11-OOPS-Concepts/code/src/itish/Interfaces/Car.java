package itish.Interfaces;

public class Car implements Engine,Break,MediaPlayer{
    int a = 33;

    @Override
    public void braeak() {
        System.out.println("Car stops on braeak");
    }

    @Override
    public void start() {
        System.out.println("Engine start like a normal car");
    }


    @Override
    public void stop() {
        System.out.println("Engine stop like a normal car ");

    }

    @Override
    public void acc() {
        System.out.println("Engine accerate like a normal method ");
    }
}
