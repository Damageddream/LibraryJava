package exercises.abstrainterf.workers;

public class PartTime extends Emplyee{

    private int hours;
    private double perHour;

    public PartTime(String name, String lastName, int hours, double perHour) {
        super(name, lastName);
        this.hours = hours;
        this.perHour = perHour;
    }

    @Override
    double monthlyEarnings() {
        return hours * perHour;
    }

    @Override
    double yearlyEarnings() {
        return monthlyEarnings()*12;
    }
}
