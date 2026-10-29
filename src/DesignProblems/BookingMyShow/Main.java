package DesignProblems.BookingMyShow;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        User user = new User(1, "1234567890");

        Movie movie1 = new Movie("1" , "180min" , "Avengers");

        Show show1 = new Show(1,  movie1, 9, 10);

        Screen screen1 = new Screen(1, List.of(show1));

        Theatre theatre1 = new Theatre("1", "PVR", List.of(screen1));

        BookingManager bookingManager = new BookingManager();

        //fill cityMap
        bookingManager.cityTheatreMap.put("Bengaluru", List.of(theatre1));

        List<Movie> movies = bookingManager.getAllMovies("Bengaluru");

        for(Movie movie : movies) {
            System.out.println("Movie ID: " + movie.movieId + ", Movie Name: " + movie.movieName);
        }

        List<Theatre> theatres = bookingManager.getAllTheatres("Bengaluru", "1");

        for(Theatre theatre : theatres) {
            System.out.println("Theatre ID: " + theatre.theatreId + ", Theatre Name: " + theatre.theatreName);
        }

        List<Show> shows = bookingManager.getAllShows("Bengaluru", "1", "1");

        for(Show show : shows) {
            System.out.println("Show ID: " + show.showId + ", Movie Name: " + show.movie.movieName);
        }
        Show show = shows.get(0);
        Thread t1 = new Thread(() -> {
            Booking booking = bookingManager.bookTicket(show , 2 , List.of(1, 2, 3));
            if(booking != null){
                System.out.println("successfully booked ticket for user " + booking.userId + " for movie " + booking.show.movie.movieName + " show" +
                        "startTime is " + booking.show.startTime + " endTime is " + booking.show.endTime);
            }
        });

        Thread t2 = new Thread(() -> {
            Booking booking = bookingManager.bookTicket(show , user.Id , List.of(1, 2, 3));
            if(booking != null){
                System.out.println("successfully booked ticket for user " + booking.userId + " for movie " + booking.show.movie.movieName + " show" +
                        "startTime is " + booking.show.startTime + " endTime is " + booking.show.endTime);
            }
        });

        t1.start();
        t2.start();


    }
}
