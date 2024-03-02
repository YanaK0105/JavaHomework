package Homework4;

import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

public class Man {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        LocalDate randomDate = generateRandomDate();
        Period period = Period.between(randomDate, currentDate);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("Человек родился " + years + " лет " + months + " месяцев " + days + " дней назад.");
    }

    public static LocalDate generateRandomDate() {
        Random random = new Random();
        int year = 1950 + random.nextInt(61); // 1950 + случайное число от 0 до 60 (включительно)
        int month = 1 + random.nextInt(12); // 1 + случайное число от 0 до 11 (включительно)
        int day = 1 + random.nextInt(25); // 1 + случайное число от 0 до 24 (включительно)
        return LocalDate.of(year, month, day);
    }
}

