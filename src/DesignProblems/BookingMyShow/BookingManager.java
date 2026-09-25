package DesignProblems.BookingMyShow;

public class BookingManager {


    BookingManager() {
        // Initialize the booking manager
    }

    Ticket book(User user, Movie movie, Theatre theatre, Screen screen, Show show1 , int seatNumber) {

        // check for avaibility
        boolean book = show1.bookSeat(seatNumber); // Book 1 seat for the user

        if(book){
            String ticketId = "TICKET_" + System.currentTimeMillis(); // Generate a unique ticket ID
            return new Ticket(user.Id, ticketId, movie.movieId, screen, theatre);
        }else{
            return null; // Booking failed
        }

    }
}
