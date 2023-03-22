/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ahmetkaska
 */
public class MLinkedList<T> {

    Node<T> head;

    public MLinkedList(T data) {
        this.head = new Node(data);
    }

    public void AddLast(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;

        }
    }

    public void print() {
        Node<T> temp = head;

        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;

        }
        System.out.println(" Null");

    }

    // Insert a child node with the given value after the specified parent node
    public void insertChild(int parentValue, int childValue) {
        // If the list is empty, create a new head node
        if (head == null) {
            head = new Node(parentValue);
        }

        Node parent = findIndex(parentValue);
        if (parent == null) {
            System.out.println("Parent node not found");
            return;
        }

        Node child = new Node(childValue);
        Node nextNode = parent.child;
        parent.child = child;
        child.child = nextNode;
    }

    // Helper method to find the node with the given value
    private Node findNode(int value) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(value)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    private Node findIndex(int value) {
        Node current = head;
       
                
        for (int i = 1; i <= value; i++) {
            if (current != null && value==i) {
                
                return current;
            }
           
            current = current.next;
        }
        
        return null;
    }

    public void printList() {
        if (head == null) {
            System.out.println("Multi LinkedList is empty");
            return;
        }

        Node row = head;
        while (row != null) {

            Node col = row;
            // System.out.println("|");
            // System.out.println("v");
            while (col != null) {
                System.out.print(col.data + " --> ");
                col = col.child;
            }

            System.out.println("Null");
            row = row.next;
        }
    }
}
