public class LinkedList<T> {
    private Node<T> head;
    private int size;

    // Node class to represent elements in the list
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor to initialize an empty linked list
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Add an element to the end of the linked list
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Get the size of the linked list
    public int size() {
        return size;
    }

    // Check if the linked list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Print the elements of the linked list
    public void print() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println("Linked List:");
        linkedList.print();

        System.out.println("Size: " + linkedList.size());
        System.out.println("Is Empty? " + linkedList.isEmpty());
    }
}