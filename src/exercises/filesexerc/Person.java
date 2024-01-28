package exercises.filesexerc;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String lastName;

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

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", lastName='" + lastName + '\''
                ;
    }
}
