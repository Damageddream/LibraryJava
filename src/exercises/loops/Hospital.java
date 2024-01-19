package exercises.loops;

import java.util.Scanner;

public class Hospital {
    private Patient[] patients = new Patient[10];
    public void addPatient(){
        int temp = 0;
        while(temp < patients.length){
            if(patients[temp] == null){
                patients[temp] = createPatient();
                temp = 0;
                System.out.println("Pacjent poprawnie dodany");
                break;
            } else {
                temp++;
            }
            if(temp+1 == patients.length){
                System.out.println("Limit pacjentów wyczerpany");
            }
        }
    }
    public void displayPacients(){
        if(patients[0] == null){
            System.out.println("W szpitalu nie ma aktualnie pacjentów");
        }
        for (Patient patient : patients) {
            if(patient != null){
                System.out.println("Pacjent " + patient.getName()
                +" " + patient.getLastName()+" PESEL: "+patient.getPESEL());
            }
        }
    }
    private Patient createPatient(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię pacjenta: ");
        String name = scanner.nextLine();
        System.out.println("Podaj naziwsko pacjenta: ");
        String lastName = scanner.nextLine();
        System.out.println("Podaj PESEL pacjenta: ");
        int pesel = scanner.nextInt();
        return  new Patient(name, lastName, pesel);

    }

}
