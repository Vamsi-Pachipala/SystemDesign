package DesignProblems.BookingMyShow;

public class Seat {
    int seatId;
    String seatNumber;
    SeatStatus seatStatus;

    public Seat(int seatId, String seatNumber) {
        this.seatId = seatId;
        this.seatNumber = seatNumber;
        seatStatus = SeatStatus.AVAILABLE;
    }
}
