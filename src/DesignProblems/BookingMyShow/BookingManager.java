package DesignProblems.BookingMyShow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingManager {


    Map<String , List<Theatre>> cityTheatreMap;

    BookingManager() {
       cityTheatreMap = new HashMap<>();
    }

    List<Movie> getAllMovies(String cityName) {
        List<Movie> movies = new ArrayList<>();
        if (cityTheatreMap.containsKey(cityName)) {
            List<Theatre> theatres = cityTheatreMap.get(cityName);
            for (Theatre t : theatres) {
                for (Screen s : t.screens) {
                    for (Show sh : s.shows) {
                        if (!movies.contains(sh.movie)) {
                            movies.add(sh.movie);
                        }
                    }
                }
            }
        }
        return movies;
    }

    List<Theatre> getAllTheatres(String cityId , String movieId) {
        List<Theatre> theatres = new ArrayList<>();
        for(Theatre t : cityTheatreMap.get(cityId)) {
            for(Screen s : t.screens) {
                for(Show sh : s.shows) {
                    if(sh.movie.movieId.equals(movieId)) {
                        theatres.add(t);
                    }
                }
            }
        }
        return theatres;
    }

    List<Show> getAllShows(String cityName , String theatreId, String movieId) {
        List<Show> shows = new ArrayList<>();
        for(Theatre t : cityTheatreMap.get(cityName)) {
            if(t.theatreId.equals(theatreId)) {
                for(Screen s : t.screens) {
                    for(Show sh : s.shows) {
                        if(sh.movie.movieId.equals(movieId)) {
                            shows.add(sh);
                        }
                    }
                }
            }
        }
        return shows;
    }

    Booking bookTicket(Show show, int userId, List<Integer> seatIds) {
        return show.book(userId, seatIds);
    }
}
