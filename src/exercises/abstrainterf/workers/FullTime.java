package exercises.abstrainterf.workers;

public class FullTime extends Emplyee{

    double monthlyEarnings;
    public FullTime(String name, String lastName, double monthlyEarnings) {
        super(name, lastName);
        this.monthlyEarnings = monthlyEarnings;
    }

    @Override
    double monthlyEarnings() {
        return this.monthlyEarnings;
    }

    @Override
    double yearlyEarnings() {
        double yearly = monthlyEarnings * 12;
        return ((yearly*0.05)+yearly);
    }
}
