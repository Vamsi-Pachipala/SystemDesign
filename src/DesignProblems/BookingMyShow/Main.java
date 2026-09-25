package DesignProblems.BookingMyShow;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        User user = new User("U1", "1234567890");

        Movie movie = new Movie("M1", "120", "Inception");

        Show show1 = new Show(1, movie, 100, "2024-06-01 18:00");

        Show show2 = new Show(2, movie, 100, "2024-06-01 21:00");

        List<Show> shows = new ArrayList<>();

        Screen screen = new Screen(1, shows);

        Theatre theatre = new Theatre("T1", "PVR Cinemas", List.of(screen));

        // Display Movies
        BookingManager bookingManager = new BookingManager();

        Ticket ticket = bookingManager.book(user, movie, theatre, screen, show1,1);

        if(ticket != null){
            System.out.println("Booking successful! Ticket ID: " + ticket.ticketId);
        } else {
            System.out.println("Booking failed. Seat not available.");
        }


        // Display Movies


        Ticket ticket2 = bookingManager.book(user, movie, theatre, screen, show1,1);

        if(ticket2 != null){
            System.out.println("Booking successful! Ticket ID: " + ticket2.ticketId);
        } else {
            System.out.println("Booking failed. Seat not available.");
        }

    }
}
