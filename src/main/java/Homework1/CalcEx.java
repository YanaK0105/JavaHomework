package Homework.Homework1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

import static java.lang.System.*;

public class CalcEx {
    public static void main(String[] args) {
        String escape = "ESC";
        boolean flag = true;
        do {
            Scanner scanner = new Scanner(in);
            System.out.println("Хотите начать работать? ");
            String stroka = scanner.nextLine();

            if (stroka.equalsIgnoreCase(escape)){
                flag = false;
            }
            if (flag == true) {
                System.out.println("Введите первое число: ");
                double num1 = scanner.nextDouble();
                System.out.println("Введите второе число: ");
                double num2 = scanner.nextDouble();
                System.out.println("Введите операцию: ");
                System.out.println("1. Сложение");
                System.out.println("2. Вычетание");
                System.out.println("3. Умножение");
                System.out.println("4. Деление");
                int num3 = scanner.nextInt();

                try{
                    if (num3 > 4 || num3 < 1){
                        throw new Exception("Вы должны ввести число из диапазона от 1 до 4");
                    }
                    System.out.println("Введите  число от 1 до 4");
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }

                if (num3 > 4 || num3 < 1) {
                    System.out.println("Введите  число от 1 до 4");
                } else {
                    switch (num3) {
                        case 1:
                            System.out.println(sum(num1, num2));
                            break;
                        case 2:
                            System.out.println(minus(num1, num2));
                            break;
                        case 3:
                            System.out.println(mult(num1, num2));
                            break;
                        case 4:
                            System.out.println(devid(num1, num2));
                            break;
                    }
                }
            } else {
                System.out.println("Спасибо за использование");

            }

        } while (flag == true);


    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static double minus(double num1, double num2) {
        return num1 - num2;

    }

    public static double mult(double num1, double num2) {
        return num1 * num2;

    }

    public static double devid(double num1, double num2) {
        return num1 / num2;

    }
}


