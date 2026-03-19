class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=next;
    }

}
public class InsertAtBegin {
    Node head;
    void insertAtHead(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    void display(){
        Node temp=head;

    }
    public static void main(String[] args) {

    }
}
