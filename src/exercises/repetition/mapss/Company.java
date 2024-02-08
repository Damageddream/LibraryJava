package exercises.repetition.mapss;

import java.util.HashMap;
import java.util.Map;

public class Company {
    private Map<String, Employee> employees = new HashMap<>();
    public void add(Employee emp){
        employees.put(emp.getNameLastName(), emp);
    }
    public void getInfo(String nameLastName){
        System.out.println(employees.get(nameLastName));
    }

    public Map<String, Employee> getEmployees() {
        return employees;
    }
}
