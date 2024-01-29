package exercises.array;

import java.util.Objects;

public class Person {
    private String name;
    private String lastName;
    private String PESEL;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(lastName, person.lastName) && Objects.equals(PESEL, person.PESEL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, PESEL);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", PESEL='" + PESEL + '\'' +
                '}';
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

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }

    public Person(String name, String lastName, String PESEL) {
        this.name = name;
        this.lastName = lastName;
        this.PESEL = PESEL;
    }
}
