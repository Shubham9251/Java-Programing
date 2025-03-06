package main.java.shubham.LinkedList;

public class Implementation {

    public static class Node{
        int value;
        Node next;

        Node(){}
        Node(int value){
            this.value = value;
        }

    }

    public static class LinkedList{
        Node head = null;
        Node tail = null;
        int size = 0;

        void insert(int value) {
            Node node = new Node(value);

            // if any value is not in linkedList means head==tail==null now update head and tail
            // otherwise else linkedList have some value so head==firstnodeaddress and tail==null than update tailnext and tail also.
            if (head == null) {
                head = node;
            }
            else {
                tail.next = node;
            }
            tail = node;

            size++;

        }

        void insertAt(int value, int index) {
            Node node = new Node(value);

            if (index == size) {
                insertAtEnd(value);
                return;
            }
            else if (index == 0) {
                insertAtStart(value);
                return;
            }
            if (index < 0 || index > size) {
                System.out.println("index out of bound...");
                return;
            }

            Node point = head;
            for (int i = 1; i <= index-1; i++) {
                point = point.next;
            }

            node.next = point.next;
            point.next = node;

            size++;
        }

        void insertAtEnd(int value) {
            insert(value);
        }

        void insertAtStart(int value) {
            Node node = new Node(value);

            // if any value is not in linkedList means head==tail==null now update head and tail
            // otherwise else linkedList have some value so head==firstnodeaddress
            if (head == null) {
                head = tail = node;
            }
            else {
                node.next = head; 
                head = node;
            }
            size++;
        }

        int getAt(int index) {
            if (index < 0 || index > size) {
                System.out.println("index out of bound...");
                return -1;
            }

            Node point = head;
            for (int i = 1; i <= index; i++) {
                point = point.next;
            }

            return point.value;
        }

        void deleteAt(int index) {
            if (index < 0 || index > size) {
                System.out.println("index out of bound...");
                return;
            }

            if (index == 0) {
                head = head.next;
                size--;
                return;
            }

            Node point = head;
            for (int i = 1; i < index; i++) {
                point = point.next;
            }

            point.next = point.next.next;
            tail = point;
            size--;
        }

        void display() {
            Node point = head;
            while (point!=null) {
                System.out.print(point.value + " ");
                point = point.next;
            }
            System.out.println();
        }

        // int size() {
        //     int size = 0;

        //     Node point = head;
        //     while (point!=null) {
        //         size = size+1;
        //         point = point.next;
        //     }

        //     return size;
        // }

    }

    public static void main(String[] args) {

        //creating linkedList data Structure 
        
        LinkedList list = new LinkedList();

        // methods inside LinkedList

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.display();
 
        list.insertAtEnd(8);
        list.insertAtStart(7);

        list.display();
        System.out.println(list.head.value);
        
        // list.insertAt(4,0);
        // list.display();
        
        // System.out.println(list.getAt(3));
        // System.out.println(list.size);
        
        // list.deleteAt(2);                            // this is not done yat have error
        // System.out.println(list.tail.value);
        // list.display();
        System.out.println(list.size);


    }
}
