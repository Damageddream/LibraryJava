package exercises.loops;

public class Patient {
    private String name;
    private String lastName;
    private int PESEL;
    public Patient(String name, String lastName, int PESEL){
        this.name = name;
        this.lastName = lastName;
        this.PESEL = PESEL;
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

    public int getPESEL() {
        return PESEL;
    }

    public void setPESEL(int PESEL) {
        this.PESEL = PESEL;
    }
}
