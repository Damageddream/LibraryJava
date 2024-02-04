package exercises.optionalexerc;

import java.util.Optional;
import java.util.Scanner;

class ContactApp {
    public static void main(String[] args) {
        ContactReader.readFile("contacts.csv")
                .ifPresentOrElse(ContactApp::findByEmail, ContactApp::fileNotFoundMessage);
    }

    static void findByEmail(ContactManager contactManager) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj adres email do wyszukania kontaktu:");
        String email = scanner.nextLine();
        contactManager.findByEmail(email).ifPresentOrElse(
            Contact::getShortInfo,
                ()-> System.out.println("Brak maila")
        );

    }

    static void fileNotFoundMessage() {
        System.out.println("Brak pliku z danymi");
    }
}