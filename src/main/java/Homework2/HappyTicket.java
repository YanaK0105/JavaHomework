package HomeWork;

import java.util.Scanner;

public class HappyTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите шестизначное число для проверки: ");
        int ticket = scanner.nextInt();
        System.out.println(ticket);
        int sum1 = 0;
        int sum2 = 0;
        //временная переменная
        int currentDigit;

        currentDigit = ticket % 10;
        sum1 += currentDigit;

        ticket /= 10;
        currentDigit = ticket%10;
        sum1 += currentDigit;

        ticket /= 10;
        currentDigit = ticket%10;
        sum1 += currentDigit;

        System.out.println("первая сумма" + sum1);


        ticket /= 10;
      currentDigit = ticket%10;
        sum2 += currentDigit;

        ticket /= 10;
      currentDigit = ticket%10;
        sum2 += currentDigit;

        ticket /= 10;
      currentDigit = ticket%10;
        sum2 += currentDigit;

        System.out.println("вторая сумма" + sum2);

       if ( sum1 == sum2 ){
           System.out.println("Счастливый билет");
       }
       else {
           System.out.println("Несчастливый");
       }
    }
}





