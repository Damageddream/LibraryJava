package exercises.filesexerc;

public class Employee extends Person{
    private int salary;

    public Employee(String name, String lastName, int salary) {
        super(name, lastName);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary  + super.toString()+
                "} ";
    }
}
