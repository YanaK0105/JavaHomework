package Homework;

public class Massiv {
    public static void main(String[] args) {
      //объявляем массив
      int[] array1 = {1, 2, 3, 4, 5};
        System.out.println("Массив: ");
 // Выводим первый массив
        for (int i = 0; i < array1.length; i++){
     System.out.print(array1[i]);
 }
        System.out.println();
      //Объявляем переменную, которая будет использоваться при обмене элементов
      int temp;
 //Объявляем переменную длины типа int
      int length = array1.length;
      for (int i = 0; i < length / 2; i++) {
          temp = array1[i];
          array1[i] = array1[length - i - 1];
          array1[length - i - 1] = temp;
      }
      System.out.print("Инвертированный массив: ");
      for (int element : array1) {
          System.out.print(element + " ");
      }
    }
}