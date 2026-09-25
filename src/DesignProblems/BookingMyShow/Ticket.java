package DesignProblems.BookingMyShow;

public class Ticket {

    String userId;
    String ticketId;

    String movieId;

    Screen screen;

    Theatre theatre;

    public Ticket(String userId, String ticketId, String movieId, Screen screen, Theatre theatre) {
        this.userId = userId;
        this.ticketId = ticketId;
        this.movieId = movieId;
        this.screen = screen;
        this.theatre = theatre;
    }
}
