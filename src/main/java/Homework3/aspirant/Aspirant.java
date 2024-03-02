package Homework3.aspirant;

public class Aspirant extends Student {
    String scientificWork;
    public Aspirant(String firstName, String lastName, String group,
                    double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    //Переопределить этот метод в классе Aspirant.
    // Если средняя оценка аспиранта равна 4.7 либо выше ,
    // то сумма 5600 рублей, если 3.7 - 4.7 3300,
    // иначе не получает ничего.

    @Override
    public int getScholarship(){
        if (averageMark >= 4.7){
            return 5600;
        } else if (averageMark >= 3.7) {
            return 3300;
        }else {
            return 0;
        }
    }
}
