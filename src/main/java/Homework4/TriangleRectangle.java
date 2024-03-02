package Homework4;

import java.util.Scanner;

public class TriangleRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    double a, b, diagonal;

    do {
        System.out.print("Введите значение первого катета: ");
        a = scanner.nextDouble();
        System.out.print("Введите значение второго катета: ");
        b = scanner.nextDouble();

            diagonal = Math.sqrt(a*a + b*b);
            System.out.println("Длина диагонали: " + diagonal);

            if (!(a > 0 && b > 0 && diagonal > 0 && a*a + b*b == diagonal*diagonal)) {
            System.out.println("Треугольник с такими параметрами не существует. Повторите ввод.");

            }
        } while (!(a > 0 && b > 0 && diagonal > 0 && a*a + b*b == diagonal*diagonal));



        double area = (a * b) / 2.0;

        System.out.println("Площадь прямоугольника: " + String.format("%.1f", area));
    }
}