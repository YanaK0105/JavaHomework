package Homework4;

public class Circle {
    public static void main(String[] args) {

        double circumference = 47.1;

        double radius = circumference / (2 * Math.PI);
        double area = Math.PI * Math.pow(radius, 2);
        int roundedArea = (int) Math.round(area);

        System.out.println("Радиус круга: " + radius);
        System.out.println("Площадь круга: " + roundedArea);
    }
}

