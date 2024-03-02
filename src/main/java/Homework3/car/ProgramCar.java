package Homework3.car;

public class ProgramCar {
    public static void main(String[] args) {

        FreightCar mercedes = new FreightCar("Mercedes", 10);
        mercedes.display();
        mercedes.accelerate();
        mercedes.stop();

        mercedes.loadCapacity();
        mercedes.download();
        mercedes.unload();

        PassengerCar bmv = new PassengerCar("BMW", 18);
        bmv.display();
        bmv.accelerate();
        bmv.stop();
        bmv.go();
        bmv.park();
    }
}
