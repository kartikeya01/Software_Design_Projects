// Assignment 03
// CSC 221 Sec R - Software Design Lab
// Professor: Kanchan Gondiker
// Name: Kartikeya Sharma

import java.util.Date;

public abstract class Item implements Comparable<Item> {

    // minus sign (-) sets out private scope
    private String id;
    private String title;
    private Date addedOn;   // Uses import java.util.Date

    // Plus sign (+) indicates public visibility
    // Constructor
    public Item( String id, String title, Date addedOn ) {
        this.id = id;
        this.title = title;
        this.addedOn = addedOn;
    }

    // Getter and Setter for id
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    // Getter and Setter for title
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    // Getter and Setter for addedOn
    public Date getAddedOn() { return addedOn; }
    public void setAddedOn(Date addedOn) { this.addedOn = addedOn; }

    public int compareTo(Item item) { return this.getId().compareTo(item.getId()); }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + getId() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", addedOn=" + getAddedOn().toString() +
                '}';
    }
}