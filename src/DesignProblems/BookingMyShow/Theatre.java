package DesignProblems.BookingMyShow;

import java.util.List;

public class Theatre {
    String theatreId;
    String theatreName;
    List<Screen> screens;

    public Theatre(String theatreId, String theatreName,  List<Screen> screens) {
        this.theatreId = theatreId;
        this.theatreName = theatreName;
        this.screens = screens;
    }
}
