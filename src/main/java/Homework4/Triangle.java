package Homework4;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double area;

        while (true) {
            System.out.print("Введите длину катета a: ");
            a = scanner.nextDouble();
            System.out.print("Введите длину катета b: ");
            b = scanner.nextDouble();

            if (a > 0 && b > 0 ) {
                break;
            } else {
                System.out.println("Недопустимые параметры треугольника. Пожалуйста, введите допустимые значения.");
            }
        }

        area = Math.round((0.5 * a * b * (a/b)) * 10) / 10.0;
        System.out.println("Площадь треугольника равна: " + area);
    }
}



