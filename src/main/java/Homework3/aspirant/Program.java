package Homework3.aspirant;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        // Создаем список студентов
        List<Student> students = new ArrayList<>();
        students.add(new Student("Яна", "Корнилова", "Java", 4.7));
        students.add(new Student("Леонид", "Корнилов", "Python", 3.8));
        students.add(new Student("Михаил", "Иванов", "Python", 3.5));

        // Создаем список аспирантов
        List<Aspirant> aspirants = new ArrayList<>();
        aspirants.add(new Aspirant("Всеволод", "Корнилов", "Test1", 4.9, "Тестирование веб приложений"));
        aspirants.add(new Aspirant("Виктор", "Корнилов", "Test2", 3.9, "Тестирование медицинских тренажеров"));
        aspirants.add(new Aspirant("Макс", "Иванов", "Test2", 3.5, "Тестирование андроид приложений"));

        // Вызываем метод расчета стипендии для каждого студента
        for (Student student : students) {
            double scholarship = student.getScholarship();
            System.out.println(student.firstName + " " + student.lastName + ": " + scholarship + " рублей");
        }

        // Вызываем метод расчета стипендии для каждого аспиранта
        for (Aspirant aspirant : aspirants) {
            double scholarship = aspirant.getScholarship();
            System.out.println(aspirant.firstName + " " + aspirant.lastName + ": " + scholarship + " рублей");
        }
    }
}
