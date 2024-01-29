package exercises.filesexerc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadCsv {
    public static void main(String[] args) {
        String fileName = "clients.csv";
        CountLines countLines = new CountLines();
        Scanner scanner = new Scanner(System.in);

        int length = countLines.count();
        Client[] clients = new Client[length];
        int clientsNr = 0;

        try (
                FileReader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) != null) {

                String[] personTab = line.split(",");
                int id = Integer.parseInt(personTab[0]);
                String name = personTab[1]+" "+personTab[2];
                String country = personTab[3];
                double salary =Double.parseDouble(personTab[4]);
                Client client = new Client(name, country, salary, id);
                clients[clientsNr] = client;
                clientsNr++;
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Client highestCl = countLines.highestCap(clients);
        System.out.println(highestCl.toString());
        System.out.println("Podaj nazwę kraju: ");
        String country = scanner.nextLine();
        countLines.filterCountry(country, clients);
    }

}
