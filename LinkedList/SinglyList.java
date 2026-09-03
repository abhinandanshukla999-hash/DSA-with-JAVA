package LinkedList;
import java.util.Scanner;

class SinglyList {

    
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;
    static Node tail = null;

    
    static void insert(int data) {

        Node newNode = new Node(data);

        // If the list is empty
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    static void traverse() {

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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        // Creating the linked list
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter data for node " + i + ": ");
            int data = sc.nextInt();

            insert(data);
        }

        // Displaying the linked list
        System.out.println("\nSingly Linked List:");
        traverse();
    }
}


