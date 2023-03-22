/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ahmetkaska
 */
public class Test {

    public static void main(String[] args) {

        MLinkedList<Integer> multiList = new MLinkedList<>(4);

        multiList.AddLast(2);
        multiList.AddLast(4);
        multiList.AddLast(2);
        multiList.AddLast(8);
        multiList.AddLast(2);
        multiList.AddLast(4);
        multiList.insertChild(4, 0);
        multiList.insertChild(4, 7);
        multiList.printList();
        multiList.AddLast(0);

        System.out.println("--------------------------");
        // multiList.print();
        multiList.printList();

        System.out.println("--------------------------");

        //  multiList.insertChild(8, 2);
        multiList.printList();
        System.out.println("--------------------------");
        multiList.insertChild(3, 9);
        multiList.printList();
        System.out.println("--------------------------");
        multiList.insertChild(6, 9);
        multiList.printList();
         System.out.println("--------------------------");
        multiList.insertChild(6, 7);
         multiList.printList();
    }

}
