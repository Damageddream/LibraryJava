package exercises.repetition.mapss;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComapnyApp {
    static final String DODAJ_PRACOWNIKA = "Dodaj pracownika -1";
    static final String WYSZUKA_PRACOWNIKA = "Wyszukaj pracownika -2";
    static final String WYJDZ = "Wyjdz z programu -3";
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        boolean working = true;
        Company company = new Company();
        while (working){
            getOptions();
            try {
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice){
                    case 1:{
                        try{
                            company.add(createEmp());
                        } catch (InputMismatchException e){
                            System.out.println("Niepoprawne dane");
                        }
                        break;
                    }
                    case 2:{
                        System.out.println("Podaj imie i naziwsko pracownika: ");
                        company.getInfo(sc.nextLine());
                        break;
                    }
                    case 3: {
                        System.out.println("zamykanie programu");
                        working = false;
                        break;
                    }
                    default:{
                        System.out.println("Niepoprawnie wybrana opcja");
                    }
                }
            }catch(InputMismatchException e){
                System.out.println("nieporpawny wybór, sprobuj jeszcez raz");
            }

        }
    }
    static void getOptions(){
        System.out.println("Co chcesz zrobić?");
        System.out.println(DODAJ_PRACOWNIKA);
        System.out.println(WYSZUKA_PRACOWNIKA);
        System.out.println(WYJDZ);
    }
    static Employee createEmp(){
        System.out.println("Podaj imię: ");
        String name = sc.nextLine();
        System.out.println("Podaj naziwsko: ");
        String lastName = sc.nextLine();
        System.out.println("Podaj pensję: ");
        int salary = sc.nextInt();
        sc.nextLine();
        return new Employee(name, lastName, salary);
    }
}
