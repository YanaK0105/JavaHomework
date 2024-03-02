package Homework3;

import java.util.Scanner;

public class CostOfGoods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость товара: ");
        double CostOfGoods = scanner.nextInt();
        System.out.println("Введите скидку в %: ");
        double discount = scanner.nextInt();
        double discountedPrice = CostOfGoods - (CostOfGoods * (discount / 100));
        System.out.println("Стоимость с учетом скидки: " + discountedPrice);
    }
}
// почему с int не получатся?
