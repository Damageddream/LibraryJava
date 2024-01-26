package exercises.abstrainterf.workers;

public class CompanyApp {
    public static void main(String[] args) {
        Employees employees = new Employees();
        Emplyee emp1 = new FullTime("Mar", "War", 3000);
        Emplyee emp2 = new PartTime("Wor", "Kar", 160, 30);
        Emplyee emp3 = new FullTime("Lar", "Opr", 4000);
        employees.addEmployee(emp3);
        employees.addEmployee(emp1);
        employees.addEmployee(emp2);
        System.out.println(employees.getInfo());
    }
}
