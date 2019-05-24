// Assignment 03
// CSC 221 Sec R - Software Design Lab
// Professor: Kanchan Gondiker
// Name: Kartikeya Sharma

import java.util.Date;

public abstract class MultiMediaItem extends Item {

    // minus sign (-) sets out private scope
    private int playingTime;

    // Plus sign (+) indicates public visibility
    // Constructor
    public MultiMediaItem(String id, String title, Date addedOn, int playingTime) {
        super(id, title, addedOn);
        this.playingTime = playingTime;
    }

    // Getter and Setter for playingTime
    public int getPlayingTime() { return playingTime; }
    public void setPlayingTime(int playingTime) { this.playingTime = playingTime; }

    @Override
    public String toString() {
        return "MultiMediaItem { " +
                "id = '" + getId() + '\'' +
                ", title = '" + getTitle() + '\'' +
                ", addedOn = " + getAddedOn().toString() +
                ", playingTime = " + getPlayingTime() +
                '}';
    }
}
