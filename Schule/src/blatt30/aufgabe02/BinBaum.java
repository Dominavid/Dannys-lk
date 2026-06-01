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


    public Node[] findInOrderNeighbour(Node start) {
        Node current = start;
        Node[] zarr = new Node[2];
        if (current.getLeft() != null) current = current.getLeft();
        while (current.getRight() != null) {
            current = current.getRight();
        }
        zarr[0] = current;
        if (current.getRight() != null) current = current.getRight();
        while (current.getLeft() != null) {
            current = current.getLeft();
        }
        zarr[1] = current;
        return zarr;
    }


    public Node remove(int ziel) {
        Node current = search(ziel);
        if (current == null) {
            System.out.println("nicht gefunden");
            return null;
        }
        if (current.getLeft() == null && current.getRight() == null) {
            if (current.getPapa().getRight() == current) {
                current.getPapa().setRight(null);
            } else {
                current.getPapa().setLeft(null);
            }
            return current;
        }
        if (current.getLeft() == null) {
            if (current.getPapa().getRight() == current) {
                current.getPapa().setRight(current.getRight());
            } else {
                current.getPapa().setLeft(current.getRight());
            }
            return current;
        }
        if (current.getRight() == null) {
            if (current.getPapa().getLeft() == current) {
                current.getPapa().setLeft(current.getLeft());
            } else {
                current.getPapa().setRight(current.getLeft());
            }
            return current;
        }
        //todo: auf beiden seiten gibts was
        return null;
    }



}
