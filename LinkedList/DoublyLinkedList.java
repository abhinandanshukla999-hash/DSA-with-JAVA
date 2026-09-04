
package LinkedList;

import java.util.Scanner;

class DoublyLinkedList {

    // Node class
    static class Node {
        Node prev;
        int data;
        Node next;

        Node(int data) {
            this.prev = null;
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;
    static Node tail = null;

    // Insert a new node at the end
    static void insert(int data) {

        Node newNode = new Node(data);

        // If the list is empty
        if (head == null) {
            head = newNode;
            tail = newNode;
        }

        // If the list is not empty
        else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Traverse from head to tail
    static void traverseForward() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data);

            if (current.next != null) {
                System.out.print(" -> ");
            }

            current = current.next;
        }

        System.out.println();
    }

    // Traverse from tail to head
    static void traverseBackward() {

        Node current = tail;

        while (current != null) {
            System.out.print(current.data);

            if (current.prev != null) {
                System.out.print(" -> ");
            }

            current = current.prev;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        // Creating the doubly linked list
        for (int i = 1; i <= n; i++) {

            System.out.print("Enter data for node " + i + ": ");
            int data = sc.nextInt();

            insert(data);
        }

        // Displaying the list
        System.out.println("\nDoubly Linked List (Forward):");
        traverseForward();

        System.out.println("\nDoubly Linked List (Backward):");
        traverseBackward();

        sc.close();
    }
}

