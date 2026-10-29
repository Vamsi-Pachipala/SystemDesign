package DesignProblems.BookingMyShow;

import java.util.List;

public class Booking {
    String bookingId;
    int userId;
    Show show;
    List<Seat> seats;

    public Booking(String bookingId, int userId, Show show, List<Seat> seats) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.show = show;
        this.seats = seats;
    }
}
