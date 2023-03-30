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

    public void AddParentNode(T data, int position) {
        Node<T> newNode = new Node(data, position);
        Node<T> parent = head;
        if (size2(parent) >= 5) {
            System.out.println("Game Over!");
        } else {
            if (head == null) {
                head = newNode;
                System.out.println("Node added. Position of new node is " + newNode.position + ". Data of new node is " + newNode.data + ".");

            } else {
                Node<T> temp = head;

                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
                System.out.println("Node added. Position of new node is " + newNode.position + ". Data of new node is " + newNode.data + ".");
            }
        }
    }

    // Insert a child node with the given value after the specified parent node
    public void insertChildNode(int parentIndex, int childValue) {
        // If the list is empty, create a new head node
        Node<T> temp = findIndex(parentIndex);

        if (size(temp) >= 7) {
            System.out.println("Game Over!");
        } else {
            if (head == null) {
                head = new Node(parentIndex);
            }

            Node<T> parent = findIndex(parentIndex);

            if (parent == null) {
                System.out.println("Parent node not found");
                return;
            }

            Node<T> newNode = new Node(childValue);
            Adder add = new Adder();
            Node<T> prev = newNode;
            while (parent.child != null) {
                parent = parent.child;
            }
            if (parent.data.equals(newNode.data)) {
                String data = add.add(newNode.getData(), parent.getData()).toString();
                parent.setData((T) data);
                System.out.println("Since the data of the new child node and the previous node are equal,\nthe addition process was performed and the data of the previous node was updated.\nPosition of updated node is " + parentIndex + ". Data of updated node is " + parent.getData() + ".");
                
                
            } else {
                
                parent.child = newNode;
                System.out.println("Child node added. Position of child node is " + parentIndex + ". Data of new node is " + newNode.data + ".");
                
            }

        }

    }

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

    public void printList() {
        if (head == null) {
            System.out.println("Multi LinkedList is empty");
            return;
        }

        int x = 0;
        for (int i = 1; i < 6; i++) {
            Node row = head;

            for (int y = 1; y < 8; y++) {
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

    public int size(Node<T> node) {

        int counter = 0;
        while (node != null) {
            counter++;
            node = node.child;
        }
        return counter;
    }

    public int size2(Node<T> node) {

        int counter = 0;
        while (node != null) {
            counter++;
            node = node.next;
        }
        return counter;
    }

}
