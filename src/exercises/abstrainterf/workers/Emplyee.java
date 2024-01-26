package exercises.abstrainterf.workers;

public abstract class Emplyee {
    private String name;
    private String lastName;
    abstract double monthlyEarnings();
    abstract double yearlyEarnings();

    public Emplyee(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
