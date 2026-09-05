
package LinkedList;

import java.util.Scanner;

class DoublyCircularLL {

    static class Node {
        Node prev;
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    static Node head = null;
    static Node tail = null;

    static void insert(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;

            head.next = head;
            head.prev = head;
        } else {
            newNode.prev = tail;
            newNode.next = head;

            tail.next = newNode;
            head.prev = newNode;

            tail = newNode;
        }
    }

    static void traverseForward() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

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
        

        sc.close();
    }
}
