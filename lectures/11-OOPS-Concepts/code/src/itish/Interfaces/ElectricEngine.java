package itish.Interfaces;

public class ElectricEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Electric Engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine Stops");
    }

    @Override
    public void acc() {
        System.out.println("Electric Engine Accelerate");
    }
}
