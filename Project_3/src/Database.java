// Assignment 03
// CSC 221 Sec R - Software Design Lab
// Professor: Kanchan Gondiker
// Name: Kartikeya Sharma

import java.util.ArrayList;

public class Database {

    // minus sign (-) sets out private scope
    // Used an ArrayList for Extra Credit
    private ArrayList<Item> item;

    // Plus sign (+) indicates public visibility
    // Constructor
    // Had to change default constructor to account for ArrayList
    public Database(){
        item = new ArrayList<Item>();
    }

    // Getter and Setter for item
    public ArrayList<Item> getItem() { return item; }
    public void setItem(ArrayList<Item> item) { this.item = item; }

    // Adds item to ArrayList
    public void addItem(Item item) {
        getItem().add(item);
    }

    // Prints out the ArrayList
    public void list() {
        for( int i = 0; i < item.size(); i++) {
            System.out.println(item.get(i).toString() + " ");
        }
    }

}
