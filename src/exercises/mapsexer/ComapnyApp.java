package exercises.mapsexer;

import exercises.filesexerc.Company;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ComapnyApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Comapny comapny = new Comapny();

        boolean working = true;
        while (working){
            System.out.println("Dodaj pracownika - 0 \n " +
                    "Wyszukaj pracownika po imieniu i nazwuski - 1\n" +
                    "Wyjdź z programiu - 2");
            String option = sc.nextLine();
            switch (option){
                case "0": {
                    System.out.println("Podaj imię pracownika: ");
                    String name = sc.nextLine();
                    System.out.println("Podaj naziwsko pracownika: ");
                    String lastName = sc.nextLine();
                    System.out.println("Podaj pensję pracownika: ");
                    try{
                        double sallary = sc.nextDouble();
                        sc.nextLine();
                        addEmployee(comapny.getEmployeeHashMap(), new Employee(name, lastName, sallary));
                    }catch (NoSuchElementException | IllegalStateException e){
                        System.out.println("Nieporpawna opcja");
                    }
                    break;
                }
                case "1": {
                    System.out.println("Podaj imię i nazwisko: ");
                    String nameAndLastName = sc.nextLine();
                    Employee emp = printEmp(comapny.getEmployeeHashMap(), nameAndLastName);
                    if (emp == null){
                        System.out.println("Nie ma takiego pracownika");
                    } else {
                        System.out.println(emp);
                    }
                    break;
                }
                case "2":{
                    working = false;
                    break;
                }
                default: {
                    System.out.println("Niepoprawna opcja, spróbuj ponownie");
                    break;
                }


            }
        }
    }
    public static void addEmployee(HashMap<String, Employee> employees, Employee emp){

        employees.put(emp.getName()+" "+emp.getLastName(), emp);
    }
    public static Employee printEmp(HashMap<String, Employee> employees,String nameLastName){
        return employees.get(nameLastName);
    }
}
