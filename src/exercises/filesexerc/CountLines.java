package exercises.filesexerc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountLines {
    String fileName = "clients.csv";
    int length = 0;

    public Client highestCap(Client[] clients){
        Client clientIt = clients[0];
        for (Client client : clients) {
            if(client.getSalary() > clientIt.getSalary()){
                clientIt = client;
            }
        }
        return clientIt;

    }
    public void filterCountry(String country, Client[] clients){
        for (Client client : clients) {
            if(client.getCountry().equals(country)){
                System.out.println(client.toString());
            }
        }
    }

    public int count() {
        try (
                FileReader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            while (bufferedReader.readLine() != null) {
                length++;


            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return length;
    }

}
