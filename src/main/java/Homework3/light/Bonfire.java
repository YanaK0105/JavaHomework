package Homework3.light;

public class Bonfire implements Light{
    private boolean isBurning;

    public void extinguish() {
        isBurning = false;
        System.out.println("Костер потушен");
    }
    @Override
    public void burn() {
        isBurning = true;
        System.out.println("Костер горит");
    }
}

