package blatt29.aufgabe02;

public class LinkList {
    Node head;

    public LinkList() {
        this.head = null;
    }

    public int size() {
        int size = 0;
        Node temp = this.head;
        if (temp == null) {
            return 0;
        }
        while (temp.hasNext()) {
            size++;
            temp = temp.getNext();
        }
        return size;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public Node get(int index) {
        Node temp = this.head;
        if (temp == null) {
            throw new IndexOutOfBoundsException("\"" + System.getProperty("user.name") + ", dödel\"\n\n\n-Tyrollosaurus rex");
        }
        for (int i = 0; i < index; i++) {
            if (!temp.hasNext()) {
                throw new IndexOutOfBoundsException("\"" + System.getProperty("user.name") + ", dödel\"\n\n\n-Tyrollosaurus rex");
            }
            temp = temp.getNext();
        }
        return temp;
    }

    public boolean contains(Object data) {
        Node temp = this.head;
        if (temp == null) {
            return false;
        }
        while (temp.hasNext()) {
            if (temp.data.equals(data)) {
                return true;
            }
            temp = temp.getNext();
        }
        return temp.data.equals(data);
    }

    public void add(Object data) {
        Node temp = this.head;

        while (temp.hasNext()) {
            temp = temp.getNext();
        }

        temp.setNext(new Node(data));
    }

    public void add(int index, Object data) {
        if (index < 0 || index > this.size()) {
            throw new IndexOutOfBoundsException("\"" + System.getProperty("user.name") + ", dödel\"\n\n\n-Tyrollosaurus rex");
        }
    }

    public void clear() {
        this.head = null;
    }
}
