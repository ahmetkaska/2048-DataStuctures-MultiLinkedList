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

        MLinkedList<Integer> multiList = new MLinkedList<>();
        multiList.AddLast(1, 1);
        multiList.AddLast(2, 2);
        multiList.AddLast(3, 3);
        multiList.AddLast(4, 4);
        multiList.AddLast(5, 5);
        multiList.printList();
        System.out.println("--------------------------");
        multiList.insertChild(1, 4);
        multiList.insertChild(2, 3);
        multiList.insertChild(2, 8);
        multiList.insertChild(5, 0);
        multiList.printList();
        System.out.println("--------------------------");
        //  multiList.removeChild(5,2);
        multiList.printList();
        System.out.println("--------------------------");
        multiList.yaz(5, 2);
        /*  multiList.AddLast(3, 3);
        // multiList.AddLast(1, 1);
        multiList.AddLast(4, 4);
        // multiList.AddLast(2, 2);
        // multiList.AddLast(5, 5);
        //  multiList.AddLast(6, 6);
        multiList.AddLast(2, 2);
        multiList.AddLast(2, 3);
        multiList.AddLast(2, 4);
        multiList.printList();
        System.out.println("--------------------------");
        multiList.insertChild(2, 9);
        multiList.printList();
        System.out.println("--------------------------");
        multiList.insertChild(2, 4);
        multiList.insertChild(2, 7);
        multiList.insertChild(2, 6);
        multiList.insertChild(2, 1);
        multiList.printList();
        System.out.println("--------------------------");
        multiList.removeChild(1,2);
                multiList.printList();
         */
 /*   
        System.out.println("--------------------------");
        // multiList.print();
        multiList.printList();

        System.out.println("--------------------------");

        //  multiList.insertChild(8, 2);
        multiList.printList();
        System.out.println("--------------------------");
       // multiList.insertChild(3, 9);
        multiList.printList();
        System.out.println("--------------------------");
        // multiList.insertChild(6, 9);
        multiList.printList();
        System.out.println("--------------------------");
        //multiList.insertChild(6, 7);
        multiList.printList();
        System.out.println("--------------------------");

        multiList.insertChild(1, 9);
        multiList.printList();
         System.out.println("--------------------------");

        multiList.insertChild(5, 2);
        multiList.printList();
         */
    }

}
