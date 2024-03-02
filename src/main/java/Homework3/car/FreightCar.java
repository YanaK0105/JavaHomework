package Homework3.car;

public class FreightCar extends Car{
    //свойство
    int loadCapacity;
    //чтобы класс заработал создаем супер конструктор
    public FreightCar(String brand, int fuelConsumption) {
        // с помощью ключевого слова обращаемся к конструктору класса Car,  в скобках указываются передаваемые аргументы
        super(brand, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }
    // метод загрузить,разгрузить
    public void download (){
        System.out.println(" Загрузить ");

    }

    public void loadCapacity() {
    }
    public void unload () {
        System.out.println(" Разгрузить ");
    }

}
