package exercises.mapsexer;

import java.util.HashMap;

public class Comapny {
    private HashMap<String, Employee> employeeHashMap;

    public Comapny() {
        this.employeeHashMap = new HashMap<>();
    }

    public HashMap<String, Employee> getEmployeeHashMap() {
        return employeeHashMap;
    }
}
