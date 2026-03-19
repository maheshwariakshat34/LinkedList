
public class InsertAtBegin {
    Node head;
    void insertAtHead(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.print("null");

    }
    public static void main(String[] args) {
        InsertAtBegin list=new InsertAtBegin();
        list.insertAtHead(3);
        list.insertAtHead(6);
        list.insertAtHead(9);
        list.insertAtHead(10);
        System.out.println("Linked List:");
        list.display();

    }
}
