
/**
 * 
 * @author ahmetkaska
 */
public class Node<T> { // Generic Node
    // Attributes

    Node<T> next;
    Node<T> child;
    T data;
    int position;

    // Constructors 
    public Node(T data) {
        this.next = null;
        this.child = null;
        this.data = data;

    }

    // When node is creating, it take position value
    public Node(T data, int position) {
        this.next = null;
        this.child = null;
        this.data = data;
        this.position = position;
    }

    // Getters and Setters
    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setChild(Node<T> child) {
        this.child = child;
    }

    public Node<T> getChild() {
        return child;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

}
