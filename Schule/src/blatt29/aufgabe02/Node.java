package blatt29.aufgabe02;

import blatt20.aufgabe03.Smartphone;

public class Node {
    Object data;
    private Node next;

    public Node(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public boolean hasNext() {
        return this.next != null;
    }
}
