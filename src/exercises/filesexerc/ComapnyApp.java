package exercises.filesexerc;

import java.io.*;
import java.util.Scanner;

public class ComapnyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dodaj nowych pracowników - 0");
        System.out.println("Wczytaj wszystkich pracowników - 1");

        int option = scanner.nextInt();
        scanner.nextLine();
        if (option == 0) {
            Company company = new Company();
            for (int i = 0; i < 3; i++) {
                System.out.println("Podaj imię: ");
                String name = scanner.nextLine();
                System.out.println("Podaj naziwsko: ");
                String lastName = scanner.nextLine();
                System.out.println("Podaj pensję: ");
                int salary = scanner.nextInt();
                scanner.nextLine();
                Employee employee = new Employee(name, lastName, salary);
                company.addEmployee(employee);
            }
            String fileName = "employees.obj";
            try (
                    var fs = new FileOutputStream(fileName);
                    var os = new ObjectOutputStream((fs));
            ) {
                os.writeObject(company);
                System.out.println("Nowi pracownicy dodanie");
            } catch (IOException e) {
                System.out.println("Bład zapisu plike " + fileName);
                e.printStackTrace();
            }
        } else if (option == 1) {
            String fileName = "employees.obj";
            Company company = null;
            try (
                    var fs = new FileInputStream(fileName);
                    var os = new ObjectInputStream((fs));
            ) {
                company = (Company) os.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Bład zapisu plike " + fileName);
                e.printStackTrace();
            }
            if (company != null){
                company.printEmployees();
            }
        }
    }
}
