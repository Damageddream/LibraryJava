package exercises.finalrep.mapy;

import java.util.Scanner;

public class CompanyApp {
    static Scanner sc = new Scanner(System.in);
    static final String ADD_EMP = "Dodaj pracownika -1";
    static final String SEARCH_EMP = "Wyszukaj danych o pracowniku -2";
    static final String EXIT = "Wyjdź z programu -3";
    public static void main(String[] args) {
        Employee emp1 = new Employee("War", "Kar", 1000);
        Employee emp2 = new Employee("Lir", "Mur", 2000);
        Employee emp3 = new Employee("Zor", "Byr", 1000);

        Company company = new Company();
        company.add(emp1);
        company.add(emp2);
        company.add(emp3);

        boolean working = true;
        while (working){
            System.out.println("Co chcesz zrobić");
            prinOptions();
            String choice = sc.nextLine();
            switch (choice){
                case "1": {
                    company.add(addEmp());
                    break;
                }
                case "2":{
                    System.out.println("Podaj imie i nazwisko: ");
                    String nameLastName = sc.nextLine();
                    System.out.println(company.getEmployees().get(nameLastName));
                    break;
                }
                case "3":{
                    working = false;
                    int compare = Integer.compare(1,2);
                    break;
                }
                default: {
                    System.out.println("Wybrano nieporawna opcję");
                    break;

                }


            }
        }

    }
    static Employee addEmp(){
        System.out.println("Podaj imie");
        String name = sc.nextLine();
        System.out.println("Podaj naziwsko");
        String lastName = sc.nextLine();
        System.out.println("Podaj pensję: ");
        int salary = sc.nextInt();
        sc.nextLine();
        return new Employee(name, lastName, salary);
    }
    static void prinOptions(){
        System.out.println(ADD_EMP);
        System.out.println(SEARCH_EMP);
        System.out.println(EXIT);
    }

}
