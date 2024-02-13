package exercises.finalrep.mapy;

import java.util.HashMap;

public class Company {
    private HashMap<String, Employee> employees;

    public Company() {
        this.employees = new HashMap<>();
    }
    public void add (Employee emp){
        employees.put(emp.getNameLastName(), emp);
    }

    public HashMap<String, Employee> getEmployees() {
        return employees;
    }
}
