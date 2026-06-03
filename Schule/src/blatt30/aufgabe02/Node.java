package blatt30.aufgabe02;

public class Node {
    private int data;
    private Node left;
    private Node right;
    private Node papa;


    public Node(int data, Node kleiner, Node größer, Node papa) {
        this.data = data;
        this.left = kleiner;
        this.right = größer;
        this.papa = papa;
    }

    public Node(int data, Node papa) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.papa = papa;
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getPapa() {
        return this.papa;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }



    public Node getLeft() {
        return this.left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    //todo: dieser komische i)
}