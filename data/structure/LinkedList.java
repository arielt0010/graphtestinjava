package data.structure;

public class LinkedList {
    Node head;
    Node tail;
    int size;

    public LinkedList() {
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addHead(Object data) {
        Node node = new Node(data);
        if (isEmpty()) {
            tail = node;
        }
        node.setLink(head);
        head = node;
    }

    public void addTail(Object data) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = node;
        } else {
            tail.setLink(node);
        }
        tail = node;
        size++;
    }

    public String toString() {
        return "List = {head={" + head + "}, tail{" + tail + "}size{" + size + "}}";
    }
}
