package Kartikeya_Sharma_Project_2;

public class Node {

    private Node up;
    private Node down;
    private int value;

    public Node(Node up, Node down, int value) {
        this.up = up;
        this.down = down;
        this.value = value;
    }

    public Node getUp() {
        return up;
    }

    public void setUp(Node up) {
        this.up = up;
    }

    public Node getDown() {
        return down;
    }

    public void setDown(Node down) {
        this.down = down;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
