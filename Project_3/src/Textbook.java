// Assignment 03
// CSC 221 Sec R - Software Design Lab
// Professor: Kanchan Gondiker
// Name: Kartikeya Sharma

import java.util.Date;

public class Textbook extends Item {

    // minus sign (-) sets out private scope
    private String author;

    // Plus sign (+) indicates public visibility
    // Constructor
    public Textbook(String id, String title, Date addedOn, String author) {
        super(id, title, addedOn);
        this.author = author;
    }

    // Getter and Setter for author
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    @Override
    public String toString() {
        return "Textbook { " +
                "id = '" + getId() + '\'' +
                ", title = '" + getTitle() + '\'' +
                ", addedOn = " + getAddedOn().toString() +
                ", author = '" + getAuthor() + '\'' +
                '}';
    }
}
