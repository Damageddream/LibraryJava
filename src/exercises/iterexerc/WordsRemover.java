package exercises.iterexerc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class WordsRemover {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj wyraz nr " + (i + 1));
            words.add(scanner.nextLine());
        }

        System.out.println("Podaj tekst do odfiltrowania:");
        String filterWord = scanner.nextLine();
        Iterator<String> wordIter = words.iterator();
        while(wordIter.hasNext()){
            String next = wordIter.next().toLowerCase();
            if(next.contains(filterWord.toLowerCase())){
                wordIter.remove();
            }
        }

        System.out.println(words);
    }
}
