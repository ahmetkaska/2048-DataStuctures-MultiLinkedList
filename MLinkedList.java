
/**
 *
 * @author ahmetkaska
 */
public class MLinkedList<T> { // Generic Multi Linked-List

    // Attributes
    Node<T> head;

    //Empty Constructures
    public MLinkedList() {

    }

    // AddParentNode(data, position) take two arguments data and position of node(index) 
    public void AddParentNode(T data, int position) {
        Node<T> newNode = new Node(data, position);   // arguments and node arguments take similar data
        Node<T> parent = head;
        if (sizeOfColumns(parent) >= 5) {
            System.out.println("Game Over!");
        } else {
            if (head == null) {
                head = newNode;
                System.out.println("Node added. Position of new node is " + newNode.position + ". Data of new node is " + newNode.data + ".");

            } else {
                Node<T> temp = head;

                while (temp.next != null) { // if temp is not null, temp assign after node with while cycle
                    temp = temp.next;
                }
                temp.next = newNode;       // if temp is null, newNode add end of list
                System.out.println("Node added. Position of new node is " + newNode.position + ". Data of new node is " + newNode.data + ".");
            }
        }
    }

    // Insert a child node with the given parent index after the specified parent node
    //so it hovers over the children of my parent node and goes all the way. Adds the new node to the end of the list.
    public void insertChildNode(int parentIndex, int childValue) {

        Node<T> temp = findIndex(parentIndex);

        if (sizeOfRows(temp) >= 7) {
            System.out.println("Game Over!");
        } else {
            // If the list is empty, create a new head node
            if (head == null) {
                head = new Node(parentIndex);
            }

            Node<T> parent = findIndex(parentIndex); // With the findIndex() method, the Parent index finds the entered node and assigns the temp node.
            if (parent == null) {
                System.out.println("Parent node not found");
                return;
            }
            Node<T> newNode = new Node(childValue);

            while (parent.child != null) {
                parent = parent.child;
            }

            parent.child = newNode;
            System.out.println("Child node added. Position of new child node is " + parentIndex + ". Data of new child node is " + newNode.data + ".");

        }

    }

// It takes the current node with the position value taken as a parameter.
// The previous node is before the current node. 
// If data of previous node and data of currents node are equals, sum datas and update data previous node assign sum value.
    public void AddTwoNodesWithSameData(int position) {
        Node current = findIndex(position);
        Node previous = null;

        while (current != null) {
            if (previous != null && current != null && previous.data.equals(current.data)) {

                previous.setData(Integer.sum((int) previous.data, (int) current.data));
                System.out.println("Since the data of the child node and the previous node are equal,\nthe addition process was performed and the data of the previous node was updated.\nPosition of updated node is " + position + ". Data of updated node is " + previous.getData() + ".");

                previous.setChild(current.child);
                current = previous;
            }
            previous = current;
            current = current.child;
        }
    }

    // If the index value taken as a parameter is the same as the position of the current node, it returns the current node.
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

    // Print two dimensional linked-list
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

    // size of row
    public int sizeOfRows(Node<T> node) {

        int counter = 0;
        while (node != null) {
            counter++;
            node = node.child;
        }
        return counter;
    }

    // size of columns
    public int sizeOfColumns(Node<T> node) {

        int counter = 0;
        while (node != null) {
            counter++;
            node = node.next;
        }
        return counter;
    }

}
