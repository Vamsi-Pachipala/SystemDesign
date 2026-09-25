package DesignProblems.BookingMyShow;

public class Show {

    int showId;

    Movie movie;
    boolean[] seats;

    String showTime;

    public Show(int showId, Movie movie, int totalSeats , String showTime) {
        this.showId = showId;
        this.movie = movie;
        this.seats = new boolean[totalSeats + 1]; // 1-based indexing for seats
        this.showTime = showTime;
    }

    boolean bookSeat(int seatNumber) {
        if (seatNumber < 1 || seatNumber >= seats.length) {
            System.out.println("Invalid seat number.");
            return false;
        }
        if (seats[seatNumber]) {
            System.out.println("Seat already booked.");
            return false;
        }
        seats[seatNumber] = true;
        System.out.println("Seat " + seatNumber + " booked successfully.");
        return true;
    }
}
