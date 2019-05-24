// Assignment 03
// CSC 221 Sec R - Software Design Lab
// Professor: Kanchan Gondiker
// Name: Kartikeya Sharma

import java.util.Date;

public class Video extends MultiMediaItem {

    // minus sign (-) sets out private scope
    private String director;

    // Plus sign (+) indicates public visibility
    // Constructor
    public Video(String id, String title, Date addedOn, int playingTime, String director) {
        super(id, title, addedOn, playingTime);
        this.director = director;
    }

    // Getter and Setter for director
    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }

    @Override
    public String toString() {
        return "Video { " +
                "id = '" + getId() + '\'' +
                ", title = '" + getTitle() + '\'' +
                ", addedOn = " + getAddedOn().toString() +
                ", playingTime = " + getPlayingTime() +
                ", director = '" + getDirector() + '\'' +
                '}';
    }
}
