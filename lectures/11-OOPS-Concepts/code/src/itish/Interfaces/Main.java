package itish.Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.acc(); // engine acc like a normal car
        car.braeak(); //cars stop in break
        car.start(); // engine start
        car.stop(); // engine stops
        MediaPlayer media = new Car();// little bit problem in there
        media.start(); // engine start
        media.stop(); // engine stops

//        Engine car = new Car();

//        System.out.println(((Car) car).a); // downcasting

        NiceCar car1 = new NiceCar();
        car1.start(); // power engine start
        car1.startMusic(); // music starts
        // change engine to electric
        car1.upgradeEngine(new ElectricEngine());
        car1.start(); // electric engine start
    }
}
