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
        for (int i = 0; i < clients.length-1; i++) {
            if(clients[i].getSalary() > clientIt.getSalary()){
                clientIt = clients[i];
            }
        }
//        for (Client client : clients) {
//            if(client.getSalary() > clientIt.getSalary()){
//                clientIt = client;
//            }

        return clientIt;

    }
    public void filterCountry(String country, Client[] clients){
//        for (Client client : clients) {
//            if(client.getCountry().equals(country)){
//                System.out.println(client.toString());
//            }
//        }
        double avarageSell = 0;
        int countyPeople = 0;
        for (int i = 0; i < clients.length-1; i++) {
            if(clients[i].getCountry().equals(country)){
                System.out.println(clients[i].toString());
                avarageSell += clients[i].getSalary();
                countyPeople++;
            }
        }
        if(countyPeople == 0){
            System.out.println("Brak klientów");
        } else {
            System.out.println("Średnia sprzedaż to "+(avarageSell/countyPeople));
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
