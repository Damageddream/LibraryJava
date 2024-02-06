package exercises.repetition.polimor;

public class Nurse extends Person {
    private int overHours;

    public Nurse(String name, String lastName, double salary, int overHours) {
        super(name, lastName, salary);
        this.overHours = overHours;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "overHours=" + overHours +
                "} " + super.toString();
    }

    public int getOverHours() {
        return overHours;
    }

    public void setOverHours(int overHours) {
        this.overHours = overHours;
    }
}
