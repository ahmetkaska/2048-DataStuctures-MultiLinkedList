
/**
 *
 * @author ahmetkaska
 */
public class Test {

    public static void main(String[] args) {

        MLinkedList<Integer> multiList = new MLinkedList<>(); // Creating linked-list
        // Adding parent nodes(data, position)
        multiList.AddParentNode(2, 1);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.AddParentNode(2, 4);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.AddParentNode(4, 2);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.AddParentNode(2, 3);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.AddParentNode(4, 5);
        multiList.printList();
        System.out.println("*************************************************************");
        // Adding Child Nodes (position, new data)
        multiList.insertChildNode(2, 2);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.insertChildNode(5, 4);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.AddTwoNodesWithSameData(5);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.insertChildNode(1, 8);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.insertChildNode(1, 8);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.AddTwoNodesWithSameData(1);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.insertChildNode(2, 32);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.insertChildNode(3, 2);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.AddTwoNodesWithSameData(3);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.insertChildNode(3, 64);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.insertChildNode(4, 16);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.insertChildNode(2, 64);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.insertChildNode(3, 32);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.insertChildNode(1, 16);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.AddTwoNodesWithSameData(1);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.insertChildNode(5, 16);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.insertChildNode(3, 32);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.AddTwoNodesWithSameData(3);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.AddTwoNodesWithSameData(3);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.insertChildNode(2, 64);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.AddTwoNodesWithSameData(2);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.insertChildNode(4, 8);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.insertChildNode(4, 4);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.insertChildNode(4, 2);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.insertChildNode(4, 2);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.AddTwoNodesWithSameData(4);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.AddTwoNodesWithSameData(4);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.AddTwoNodesWithSameData(4);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.AddTwoNodesWithSameData(4);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.insertChildNode(2, 2);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.insertChildNode(3, 64);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.insertChildNode(3, 32);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.insertChildNode(3, 16);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.insertChildNode(3, 8);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.insertChildNode(3, 8);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.AddTwoNodesWithSameData(3);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.AddTwoNodesWithSameData(3);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.AddTwoNodesWithSameData(3);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.AddTwoNodesWithSameData(3);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.AddTwoNodesWithSameData(3);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.insertChildNode(2, 4);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.insertChildNode(2, 8);
        multiList.printList();
        System.out.println("*************************************************************");
        multiList.insertChildNode(2, 256);
        multiList.printList();
        System.out.println("*************************************************************");

    }

}
