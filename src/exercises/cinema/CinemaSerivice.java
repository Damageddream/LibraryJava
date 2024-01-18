package exercises.cinema;

public class CinemaSerivice {
    public void sellTicket(Movie movie, Client client){
        if(movie.getAgeRequired() > client.getAge()){
            System.out.println("Film dostępny dla osób powyżej " + movie.getAgeRequired()+" lat");

        } else if (movie.getFreeSeats() == 0) {
            System.out.println("Brak wolnych miejsc na seans");

        }
        else {
            makeSell(movie, client);
            System.out.println("Sprzedano");
        }
    }
    private void makeSell(Movie movie, Client client){
        Ticket ticket = new Ticket(client, movie);
        movie.setFreeSeats(movie.getFreeSeats()-1);
        client.setTicket(ticket);
    }
}
