package exercises.cinema;

public class Ticket {
    private Client client;
    private Movie movie;
    private int ticketId;

    private int ticketIdPool = 0;

    public Ticket(Client client, Movie movie) {
        this.client = client;
        this.movie = movie;
        this.ticketId = getTicketIdPool() + 1;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getTicketIdPool() {
        return ticketIdPool;
    }

    public void setTicketIdPool(int ticketIdPool) {
        this.ticketIdPool = ticketIdPool;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }
}
