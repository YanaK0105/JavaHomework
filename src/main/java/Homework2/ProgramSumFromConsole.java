package Homework;

import java.util.Scanner;

public class ProgramSumFromConsole {
    public static void main(String[] args) {
        //ввод с консоли
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите несколько чисел и для расчета их суммы напишите esc");
        //сохраняем то, что ввели с клавиатуры и считываем как строку
        String input;
        //объявляем переменную sum .
        // Вопрос можно ли записать int sum? Читала что в классе можно,а в методе нельзя.те здесь можно
        int sum = 0;
        // считываем введеную строку nextLine(),  если вводим в консоль esc, то срабатывает метод equals
        //и мы переходим к расчету суммы введеных чисел
        try{
            while ( ! (input = scanner.nextLine()).equals("esc") ) {
                // переменной sum присваиваем сложение всех введеных в консоль чисел
                sum += Integer.parseInt(input);
        }
            System.out.println(sum);
        }
        catch (NumberFormatException e){
            System.out.println("Нельзя вводить буквы");
        }
    }
}
