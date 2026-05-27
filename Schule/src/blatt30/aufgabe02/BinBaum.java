package blatt30.aufgabe02;

public class BinBaum {
    private Node root;

    public BinBaum(Node root) {
        this.root = root;
    }
    public BinBaum() {
        this.root = null;
    }


    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }


    public Node search(int ziel) {
        Node current = root;
        while (current != null) {
            if (ziel == current.getData()) {
                return current;
            } else if (ziel < current.getData()) {
                current = current.getLeft();
            } else if (ziel > current.getData()) {
                current = current.getRight();
            } else {
                System.out.println("schere");
                return null;
            }
        }
        return null;
    }


    public void add(int ziel) {
        Node current = root;
        while (current != null) {
            if (ziel == current.getData()) {
                System.out.println("gibts schon");
                return;
            } else if (ziel < current.getData()) {
                if (current.getLeft() == null) {
                    current.setLeft(new Node(ziel, current));
                    return;
                }
                current = current.getLeft();
            } else if (ziel > current.getData()) {
                if (current.getRight() == null) {
                    current.setRight(new Node(ziel, current));
                    return;
                }
                current = current.getRight();
            }
        }
    }


    //todo: findInOrderNeighbour


    public Node remove(int ziel) {
        Node current = search(ziel);
        if (current == null) {
            System.out.println("nicht gefunden");
            return null;
        }
        if (current.getLeft() == null && current.getRight() == null) {
            if (current.getPapa() == current) {
                current.setLeft(null);
            } else {
                current.setRight(null);
            }
            //todo:zu ende machen
        }
    }
}
