package Homework4;

import java.util.Scanner;

public class Logarithms {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите основание логарифма: ");
        double base = scanner.nextDouble();

        System.out.print("Введите аргумент логарифма: ");
        double argument = scanner.nextDouble();

        int result = (int)Math.round(Math.log(argument) / Math.log(base));
        System.out.println("Логарифм " + argument + " по основанию " + base + " = " + result);

//примеры
            int result1 = (int)Math.round(Math.log(16) / Math.log(4));
            System.out.println("Логарифм 16" + " по основанию 4  = " + result1);

            int result2 = (int)Math.round(Math.log(1.0/3.0) / Math.log(3));
            System.out.println("Логарифм (1/3)" + " по основанию 3  = " + result2);

            int result3 = (int)Math.round(Math.log(1) / Math.log(Math.sqrt(5)));
            System.out.println("Логарифм 1" + " по основанию квадратного кореня из числа 5 = "   + result3);

            int result4 = (int)Math.round(Math.log(Math.sqrt(7)) / Math.log(Math.sqrt(7)));
            System.out.println("Логарифм квадратного корня из числа 7" + " по основанию квадратного корня из числа 7 = " +  result4);

            int result5 = (int)Math.round(Math.log(Math.sqrt(3)) / Math.log(3));
            System.out.println("Логарифм квадратного корня из числа 3" + " по основанию 3"  + " = " + result5);
            }
    }

