package Kartikeya_Sharma_Project_2;

public final class BinaomialTreeFactory {

    private Node root;
    private int T;
    private int P;

    public BinaomialTreeFactory(int T, int P){
        this.T = T;
        this.P = P;
    }

    public Node getRoot(){
        return this.root;
    }

    public void setRoot(Node root){
        this.root = root;
    }

    public void createTree(){
        root = Create(T, P);
    }

    public static Node Create(int T, int P){
        if(T == 1) {
            return new Node(null, null, P);
        } else {
            T--; /*Decrement T*/
            Node leftNode = Create(T, P);
            Node rightNode = Create(T, P);
            return new Node(leftNode, rightNode, P);
        }
    }
}

