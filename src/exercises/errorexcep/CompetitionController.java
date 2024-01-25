package exercises.errorexcep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompetitionController {
    private Scanner scanner = new Scanner(System.in);

    void run() {
        try {
            Competition competition = createCompetition();
            fillParticipantsInfo(competition);
            printCompetition(competition);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }

    }

    private Competition createCompetition() {
        String competitionName = null;
        int maxParticipants = 0;
        int ageLimit = 0;
        try {
            System.out.println("Podaj nazwę zawodów:");
            competitionName = scanner.nextLine();
            System.out.println("Podaj maksymalną liczbę uczestników:");
            maxParticipants = scanner.nextInt();
            if (maxParticipants < 0) {
                throw new NegativeNumberException("Liczba uczestnikó nie może być mniejsza niż 0");
            }
            System.out.println("Podaj ograniczenie wiekowe:");
            ageLimit = scanner.nextInt();
            if (ageLimit < 0) {
                throw new NegativeNumberException("Wiek nie może być mniejszy niż 0");
            }
            scanner.nextLine();
            return new Competition(competitionName, maxParticipants, ageLimit);
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private void fillParticipantsInfo(Competition competition) {
        while (competition.hasFreeSpots()) {
            System.out.println("Dodaj nowego uczestnika");
            Participant participant = createParticipant();
            competition.addParticipant(participant);
        }
    }

    private Participant createParticipant() {
        String firstName = null;
        String lastName = null;
        String id = null;
        int age = 0;
        try {
            System.out.println("Podaj imię:");
            firstName = scanner.nextLine();
            System.out.println("Podaj nazwisko:");
            lastName = scanner.nextLine();
            System.out.println("Podaj id (np. pesel):");
            id = scanner.nextLine();
            System.out.println("Podaj wiek:");
            age = scanner.nextInt();
            if (age < 0) {
                throw new NegativeNumberException("Wiek nie może być mniejszy niż 0");
            }
            scanner.nextLine();
            return new Participant(firstName, lastName, id, age);

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private void printCompetition(Competition competition) {
        System.out.println(competition.toString());
    }
}
