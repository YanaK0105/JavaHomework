package Homework;

       //Натуральное число, большее 1 , называется простым,
       //если оно ни на что не делится, кроме себя и 1 .
       //Другими словами, n > 1 – простое, если при его
       //делении на любое число кроме 1 и n есть остаток.
       //Например, 5 это простое число, оно не может быть
       //разделено без остатка на 2 , 3 и 4 .

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int x;
        boolean primeNum = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для проверки: ");
        //Считывает число
        int input1 = scanner.nextInt();
        // проверяем число на простоту

        if (input1 <= 1) {
            primeNum = false;

            //break; - пщчему не нужно здесь?
        }

        for (int i = 2; i * i <= input1; i++) {
            x = input1 % i;

            if (x == 0) {
                primeNum = false;
                break;
            }
        }
        // если переменная isPrime равна true, то число простое
        if(primeNum) {
            System.out.println(input1 + " - простое число");
        } else {
            System.out.println(input1 + " - составное число");
        }
    }
}

