package Homework3.light;

public class ProgramLight {
    public static void main(String[] args) {
        Bonfire bonfire = new Bonfire();
        // горит этот объект
        bonfire.burn();
        // можно потушить
        bonfire.extinguish();

        Bulb Bulb = new Bulb();
        // вводим цвет лампы
        Bulb.setColor();
        Bulb.turnOn();
        // горит цветом, который мы ввели
        Bulb.burn();
        Bulb.turnOff();
        // лампа не горит
        Bulb.burn();
    }
}


