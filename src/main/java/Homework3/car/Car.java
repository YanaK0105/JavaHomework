package Homework3.car;

public class Car {

    public String brand;
    public int fuelConsumption;

    public Car(String brand, int fuelConsumption) {
        this.brand = brand;
        this.fuelConsumption = fuelConsumption;
    }

    public String getBrand() {
        return brand;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void display (){
        System.out.println("Марка автомобиля: " + brand + " расход топлива: " + fuelConsumption);
    }

    public void accelerate (){
        System.out.println(" Разогнаться ");
    }
    public void stop (){
        System.out.println(" Остановиться ");
    }
}

