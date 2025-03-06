package main.java.shubham.LinkedList;

// LinkedList is one of the "Data Structure" and used to store unstructuresd data.
// LinkedList does not allow to index based access element from list because LinkedList does not use sequenceal storage like Array or Arraylist in memory.
// linkedList overcome the disadvantage of ArrayList or Array which is index based insertion in list or array because both take more time.
// LinkedList is store as a node(object) in memory and that node have two things one is value and second is address of next node.
// that node by default point to "null".
// in List start node is called as 'head' and end node is 'tail'.

public class linkedList {

    public static void displayRevers(Node point) {
        
        if (point==null) {
            return;
        }
        
        displayRevers(point.next);
        System.out.print(point.value + " ");
    }
    public static void display(Node point) {
        
        if (point==null) {
            return;
        }

        System.out.print(point.value + " ");
        display(point.next);
    }

    public static class Node {
        int value;
        Node next;

        Node (){};
        Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {

        Node node = new Node();     // this line code is create Node in memory
        System.out.println(node);  // DSA.LinkedList.linkedList$Node@28a418fc
        System.out.println(node.value);  // 0
        System.out.println(node.next);  // null

        // creating linkedList in memory...
        Node node1 = new Node(2);    // head node
        Node node2 = new Node(4);
        Node node3 = new Node(6);
        Node node4 = new Node(8);
        Node node5 = new Node(10);
        Node node6 = new Node(12);   // tail node

        // link the nodes with each other...

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        // display

        // without loop
        System.out.println(node1.value);
        System.out.println(node2.value);
        System.out.println(node3.value);
        System.out.println(node4.value);
        System.out.println(node5.value);
        System.out.println(node6.value);

        // with loop
        // Node point = node1;
        // while (point!=null) {
            
        //     System.out.print(point.value + " ");
        //     point = point.next;
        // }

        // now insertion element at end
        
        Node node7 = new Node(14);
        node6.next = node7;
        
        System.out.println(node7.value);
        
        // now insertion element at mid

        Node node0 = new Node(0);
        node0.next = node5;
        node4.next = node0;


        Node point = node1;
        while (point!=null) {
            
            System.out.print(point.value + " ");
            point = point.next;
        }

        // displaing using resurcion...
        System.out.println();
        display(node1);
        System.out.println();
        displayRevers(node1);
    }
}