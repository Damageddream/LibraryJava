package pl.javastart.library.io;

import pl.javastart.library.model.Book;

import java.util.Scanner;

public class DataReader {
    private Scanner sc = new Scanner(System.in);

    public void close(){
        sc.close();
    }

    public int getInt() {
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }
    public Book readAndCreateBook(){
        System.out.println("Tytuł: ");
        String title = sc.nextLine();
        System.out.println("Autor: ");
        String author = sc.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = sc.nextLine();
        System.out.println("ISBN: ");
        String isbn = sc.nextLine();
        System.out.println("Rok wydania: ");
        int realaseDate = sc.nextInt();
        sc.nextLine();
        System.out.println("Ilość stron: ");
        int pages = sc.nextInt();
        sc.nextLine();
        return new Book(title, author, realaseDate, pages, publisher, isbn);
    }
}
