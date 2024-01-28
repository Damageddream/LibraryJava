package exercises.filesexerc;

import exercises.abstrainterf.workers.Emplyee;

import java.io.Serializable;

public class Company implements Serializable {
    private static final int MAX_EMPLOYEES = 3;
    private Employee[] employees;
    private int employeeNr;

    public Company() {
        this.employees = new Employee[MAX_EMPLOYEES];
        this.employeeNr = 0;
    }


    public void addEmployee(Employee employee){
        this.employees[employeeNr] = employee;
        employeeNr++;
    }
    public void printEmployees(){
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
