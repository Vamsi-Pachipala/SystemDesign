package DesignProblems.BookingMyShow;

import java.util.List;

public class Screen {
    int screenId;

    List<Show> shows;


    public Screen(int screenId, List<Show> shows) {
        this.screenId = screenId;
        this.shows = shows;
    }

    void addShow(Show show) {
        shows.add(show);
    }

    void displayShows() {
        for (Show show : shows) {
            System.out.println("Show ID: " + show.showId + ", Movie Name: " + show.movie.movieName);
        }
    }

}
