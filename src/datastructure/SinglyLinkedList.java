package datastructure;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    Node start;

    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.start = new Node(5);
        sl.insert(12);
        sl.insert(4);
        sl.insert(88);
        sl.print();
        System.out.println("==================");
        sl.delete(12);
        sl.print();
        System.out.println(sl.search(4));
    }

    public void insert(int data) {
        Node current = start;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void print() {
        Node current = start;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void delete(int data) {
        Node current = start;
        if (data == start.data) {
            start = start.next;
            return;
        }
        while (current.next.data != data) {
            current = current.next;
        }
        current.next = current.next.next;
    }

    public boolean search(int data) {
        Node current = start;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
