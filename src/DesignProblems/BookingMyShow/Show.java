package DesignProblems.BookingMyShow;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Show {

    int showId;

    Movie movie;

    Map<Integer , Seat> seats; // seatId to Seat mapping

    int startTime ;
    int endTime; // for now using integers like 9 to 12 for 9AM to 12PM

    public Show(int showId, Movie movie, int startTime, int endTime) {
        this.showId = showId;
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = endTime;
        seats = new HashMap<>();
        fillSeats();
    }
    private void fillSeats() {
        for(int i = 1 ; i <= 100 ; i++) {
            seats.put(i , new Seat(i , "S" + i));
        }
    }

    public synchronized Booking  book(int userId , List<Integer> seats){
        // check if seats are available
        for(int seatId : seats) {
            if(!this.seats.containsKey(seatId) || this.seats.get(seatId).seatStatus == SeatStatus.BOOKED) {
                System.out.println("Seat " + seatId + " is not available" + " for user "+userId);
                return null;
            }
        }

        // mark seats as booked
        for(int seatId : seats) {
            this.seats.get(seatId).seatStatus = SeatStatus.BOOKED;
        }

        // create booking
        return new Booking("B" + System.currentTimeMillis(), userId, this, seats.stream().map(seatId -> this.seats.get(seatId)).toList());
    }
}
