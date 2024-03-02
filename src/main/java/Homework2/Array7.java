package HomeWork;

import java.util.Scanner;

public class Array7 {
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
       System.out.print ("Массив: ");
          for (int i = 0; i < length; i++) {
              System.out.print (" " + array[i]); // Выводим на экран, полученный массив//
               }

          System.out.println();
          System.out.println();

          int min = array[0];
          for (int i = 0; i < array.length; i++){
              if (min > array[i]) {
                  min = array[i];
              }
          }
          System.out.println("Минимальное число: " + min);

          System.out.println();
          int max = array[0];
          for (int i = 0; i < array.length; i++){
            if (max < array[i]) {
                max = array[i];
            }
        }
          System.out.println("Максимальное число: " + max);
    }
}


