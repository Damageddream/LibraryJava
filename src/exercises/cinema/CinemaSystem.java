package exercises.cinema;

class CinemaSystem {
    public static void main(String[] args) {
        Movie movie = new Movie("Omen", "horror", 128, 16);
        Client client1 = new Client("Jan", "Kowalski", 15);
        Client client2 = new Client("Anna", "Zalewska", 19);
        CinemaSerivice cinemaService = new CinemaSerivice();
        cinemaService.sellTicket(movie, client1);
        cinemaService.sellTicket(movie, client2);

        CinemaInfo cinemaInfo = new CinemaInfo();
        String ticketInfo = cinemaInfo.getTicketInfo(client1);
        String ticketInfo2 = cinemaInfo.getTicketInfo(client2);
        String seatsInfo = cinemaInfo.getSeatsInfo(movie);
        System.out.println(ticketInfo);
        System.out.println(ticketInfo2);
        System.out.println(seatsInfo);


    }
}
