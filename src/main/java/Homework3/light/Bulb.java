package Homework3.light;

import java.util.Scanner;

public class Bulb implements Light{
    boolean isOn;
    String color;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void setColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цвет лампы:");
        color = scanner.nextLine();
    }
    @Override
    public void burn() {
        if (isOn) {
            System.out.println("Лампа горит цветом: " + color);
        } else {
            System.out.println("Лампа не горит");
        }
    }
}


