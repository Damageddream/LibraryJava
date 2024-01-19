package exercises.loops;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();

        while(true){
            System.out.println("Wybierz opcje 0-Wyjście z programu" +
                    " 1-dopisanie pacjenta "+"2-wyświetlenie listy zapisanych pacjentów" );
            int choice = scanner.nextInt();
            if(choice == 0){
                System.out.println("Dziękujemy, do zobacznienia!");
                break;
            } else if(choice == 1){
                hospital.addPatient();
            } else if (choice == 2) {
                hospital.displayPacients();
            } else {
                System.out.println("Niepoprawna opcja, wybierz ponownie");
            }

        }

    scanner.close();

    }
}
