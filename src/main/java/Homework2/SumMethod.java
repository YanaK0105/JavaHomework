package Homework;

//Написать метод, с клавиатуры вводится число, нужно посчитать сумму цифр этого числа и вывести на печать

import java.util.Scanner;

public class SumMethod {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        sumOfDigits();

    }
    public static int sumOfDigits() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
        return sum;
    }
}