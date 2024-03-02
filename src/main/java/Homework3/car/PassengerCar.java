package Homework3.car;

public class PassengerCar extends Car{
    String tipKuzova;
    public PassengerCar(String brand, int fuelConsumption) {
        super(brand, fuelConsumption);
        //с помощью ключевого слова указываем ссылку
        this.tipKuzova = tipKuzova;
    }
    // метод поехать, припарковаться
    public void go(){
        System.out.println(" Поехать ");
    }
    public void park (){
        System.out.println(" Припарковаться ");
    }
}

