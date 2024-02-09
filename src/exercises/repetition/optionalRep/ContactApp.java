package exercises.repetition.optionalRep;

import java.util.Optional;
import java.util.Scanner;

class ContactApp {
    public static void main(String[] args) {
        Optional<ContactManager> contactManager = ContactReader.readFile("contacts.csv");
        contactManager.ifPresentOrElse(
                ContactApp::ifFileCorrect,
                ()-> System.out.println("Nie ma pliku")
        );


    }
    public static void ifFileCorrect(ContactManager contactManager){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj adres email do wyszukania kontaktu:");
        String email = scanner.nextLine();
        System.out.println("Kontakt o wskazanym adresie email:");
        Optional<Contact> contactByEmail = contactManager.findByEmail(email);
        contactByEmail.ifPresentOrElse(
                con -> System.out.println(con.getShortInfo()),
                ()-> System.out.println("Brak kontaktu o wskazanym adresie")
        );
    }
}