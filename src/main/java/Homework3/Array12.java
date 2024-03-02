package Homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//На вход поступает два числа, нижняя граница и верхняя граница. Заполнить массив из 10 чисел этими случайными числами
public class Array12 {
    public static void main(String[] args) {
        //создадим экземпляр класса Random
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начало диапазона: ");
        int min = scanner.nextInt();
        System.out.println("Введите окончание диапазона: ");
        int max = scanner.nextInt();
        //задаем размер массива
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            // random.nextInt - это класс random, метод nextInt генерирует случайное число
            // в заданном диапазоне. Чтобы охватить весь заданный диапазон, мы добавляем к
            // результату значение нижней границы.
            array[i] = random.nextInt(max - min + 1) + min;
        }
        // используем метод toString для вывода массива в консоль
        System.out.println(Arrays.toString(array));
    }
}
