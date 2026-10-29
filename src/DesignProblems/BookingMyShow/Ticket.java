package DesignProblems.BookingMyShow;

public class Ticket {

    Booking booking;
    int ticketId;

    public Ticket(Booking booking, int ticketId) {
        this.booking = booking;
        this.ticketId = ticketId;
    }
}
