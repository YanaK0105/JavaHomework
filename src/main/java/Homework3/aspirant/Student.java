package Homework3.aspirant;

public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }
    //Создать метод getScholarship() для класса Student,
    // который возвращает сумму стипендии.
    // Если средняя оценка студента равна 4.7 либо выше, то сумма 3200рублей,
    // если 3.7 - 4.7 2100, иначе не получает ничего.
    public int getScholarship(){
        if (averageMark >= 4.7){
            return 3200;
        } else if (averageMark >= 3.7) {
            return 2100;
        }else {
            return 0;
        }
    }
}
