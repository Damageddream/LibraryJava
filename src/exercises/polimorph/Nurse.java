package exercises.polimorph;

public class Nurse extends Person {
    private double overtime;

    public Nurse(String name, String lastName, double salary, double overtime) {
        super(name, lastName, salary);
        this.overtime = overtime;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }
}
