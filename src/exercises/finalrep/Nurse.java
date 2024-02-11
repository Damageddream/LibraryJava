package exercises.finalrep;

public class Nurse extends Person {
    private double overtime;

    public Nurse(String name, String lastName, double salary, double overtime) {
        super(name, lastName, salary);
        this.overtime = overtime;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "overtime=" + overtime +
                "} " + super.toString();
    }
}
