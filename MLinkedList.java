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
    
    public MLinkedList() {
        if (head == null) {
            //System.out.println("List is empty!!");
        }
    }

    public void AddLast(T data, int position) {
        Node<T> newNode = new Node(data, position);
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
    public void insertChild(int parentIndex, int childValue) {
        // If the list is empty, create a new head node
        if (head == null) {
            head = new Node(parentIndex);
        }

        Node parent = findIndex(parentIndex);
        if (parent == null) {
            System.out.println("Parent node not found");
            return;
        }

        Node newNode = new Node(childValue);
        Node nextNode = parent.child;
        parent.child = newNode;
        newNode.child = nextNode;
    }

    /* Helper method to find the node with the given value
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
     */
    private Node findIndex(int index) {
        Node current = head;

        for (int i = 1; i <= 6; i++) {

            if (current != null && index == current.position) {

                return current;
            }

            current = current.next;
        }

        return null;
    }

    /*
    public void pprintList() {
        if (head == null) {
            System.out.println("Multi LinkedList is empty");
            return;
        }

        Node row = head;
        int x = 0;
        while (row != null) {

            Node col = row;
            if (x != 0) {
                System.out.println("|");
            }
            // System.out.println("v");
            while (col != null) {
                System.out.print(col.data + " --> ");
                col = col.child;
            }

            System.out.println("Null");
            row = row.next;
            x++;

        }
        System.out.println("|");
        System.out.println("Null");
    }
     */
    public void printList() {
        if (head == null) {
            System.out.println("Multi LinkedList is empty");
            return;
        }

        //Node row = head;
        int x = 0;
        for (int i = 1; i < 6; i++) {
            Node row = head;

            for (int y = 1; y < 7; y++) {
                if (row != null) {

                    if (i == row.position) {
                        Node col = row;
                        if (x != 0) {
                            System.out.println("|");
                        }
                        // System.out.println("v");
                        while (col != null) {
                            System.out.print(col.data + " --> ");
                            col = col.child;
                        }

                        System.out.println("Null");
                        x++;
                    }
                    row = row.next;

                }
            }
        }
        System.out.println("|");
        System.out.println("Null");
    }

    public void removeChild(int x, int y) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        Node prev = null;

        // Traverse down the list to find the row
        while (temp != null && !temp.data.equals(x)) {
            prev = temp;
            temp = temp.child;
        }

        if (temp == null) {
            System.out.println("Row not found.");
            return;
        }

        Node rowHead = temp;
        Node rowTemp = temp.next;
        Node rowPrev = temp;

        // Traverse across the row to find the column
        while (rowTemp != null && !rowTemp.data.equals(y) ) {
            rowPrev = rowTemp;
            rowTemp = rowTemp.next;
        }

        if (rowTemp == null) {
            System.out.println("Column not found.");
            return;
        }

        // Remove the node
        if (rowTemp == rowHead) {
            rowHead = rowHead.next;
            temp.child = rowHead;
        } else {
            rowPrev.next = rowTemp.next;
        }

        // Update the row and column pointers
        if (rowHead == null) {
            prev.child = temp.child;
        }

        System.out.println("Node removed: (" + x + ", " + y + ")");
    }
    
    public void yaz(int row, int col){
        Node<T> temp = head;
        
        for(int i = 1; i<= row; i++){
            temp = temp.next;
           
        }
         Node<T> down = temp;
            for(int y = 1; y<=col;y++){
                down = down.child;
                
            }
            System.out.println("Data = " + down.data);
        
        
    }


}
