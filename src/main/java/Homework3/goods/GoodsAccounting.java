package Homework3.goods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsAccounting {
    private List<Product> productList;

    public GoodsAccounting() {
        this.productList = new ArrayList<>();
    }

    public static void main(String[] args) {
        GoodsAccounting product = new GoodsAccounting();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" Выберите действие: ");
            System.out.println("1 Добавить элемент");
            System.out.println("2 Удалить элемент");
            System.out.println("3 Вывести все элементы на складе");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Введите название товара:");
                    String name = scanner.nextLine();
                    System.out.println("Введите стоимость товара:");
                    double price = scanner.nextDouble();
                    System.out.println("Введите количество товара:");
                    int quantity = scanner.nextInt();
                    product.addProduct(name, price, quantity);
                    System.out.println("Товар успешно добавлен");
                    break;
                case 2:
                    System.out.println("Введите индекс товара для удаления:");
                    int index = scanner.nextInt();
                    product.removeProduct(index);
                    System.out.println("Товар успешно удален");
                    break;
                case 3:
                    product.withdrawProduct();
                    break;
                default:
                    System.out.println("Некорректный выбор, попробуйте снова");
                    break;
            }
        }
    }

    public void addProduct(String name, double price, int quantity) {
        Product product = new Product(name, price, quantity);
        productList.add(product);
    }

    public void removeProduct(int index) {
        if (index >= 0 && index < productList.size()) {
            productList.remove(index);
        } else {
            System.out.println("Некорректный индекс товара");
        }
    }

    public void withdrawProduct() {
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            System.out.println(i + " " + product.getName() + " " + product.getPrice() + " " + product.getQuantity());
        }
    }
}


