package HomeWork;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве");
        //вводим переменную длины массива
        int length = scanner.nextInt();
        //создаем массив нужного размера
        int[] array = new int[length];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Массив: ");
        for (int i = 0; i < length; i++) {
            System.out.print(" " + array[i]); // Выводим на экран, полученный массив//
        }

        System.out.println();
        System.out.println();


        int sum = 0;
        int currentDigit;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 1) {
                currentDigit=array[i];
                sum +=currentDigit;
            }
            System.out.print("индекс " + i + " = " + array[i] + ", ");
            System.out.println("Сумма чисел нечетных индексов массива: " + sum);
        }
    }
}
