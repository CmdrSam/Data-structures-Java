package myDSA;

public class Node {
    private int data;
    public Node next = null;
    public Node(int d){
        this.data = d;
    }
    public int getData(){
        return this.data;
    }

    public void insertAtEnd(int data, Node head){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(data);
        System.out.println("Data inserted at the end");
    }

    public Node insertFront(int data, Node head){
        Node temp = new Node(data);
        temp.next = head;
        return temp;
    }

    public void display(Node head){
        Node temp = head;
        while(temp.next != null){
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }

}
