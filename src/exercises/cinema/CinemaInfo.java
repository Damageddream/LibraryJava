package exercises.cinema;

public class CinemaInfo {
    public String getTicketInfo(Client client){
        if(client.getTicket() != null){
            return "Sprzedane bilety: \n" +
                    client.getTicket().getTicketId()+" | "+
                    client.getTicket().getClient().getLastName() + " | " +
                    client.getTicket().getMovie().getTitle() + " | " +
                    client.getTicket().getMovie().getType() + " | " +
                    client.getTicket().getMovie().getTime() + " min ";
        }
        else{
            return  "Klient nie posiada biletu";
        }
    }
    public String getSeatsInfo(Movie movie){
        return "Liczba pozostałych miejsc: " + movie.getFreeSeats()+
                "\nLiczba sprzedanych biletówL " + (movie.getMaxSeats() - movie.getFreeSeats());

    }
}
