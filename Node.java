/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ahmetkaska
 */
public class Node <T>{
    
    Node<T> next;
    Node<T> child;
    T data;
    
    public Node(T data){
        this.next = null;
        this.child = null;
        this.data = data;
    }
    
}
