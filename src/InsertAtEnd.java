public class InsertAtEnd {
    Node head;
    void insertAtEnd(int data){
        Node newNode=new Node(data);
        Node temp=head;
        if(head==null){
            head=newNode;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        InsertAtEnd list=new InsertAtEnd();
        list.insertAtEnd(56);
        list.insertAtEnd(5);
        list.insertAtEnd(67);
        list.display();

    }
}
