public class DeleteAtEnd {
    Node head;
    void deleteAtEnd(){
        if(head==null || head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    void insertAtHead(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        DeleteAtEnd list=new DeleteAtEnd();
        list.insertAtHead(5);
        list.insertAtHead(6);
        list.insertAtHead(7);
        System.out.print("Before deletion: ");
        list.display();
        list.deleteAtEnd();
        System.out.print("After deletion: ");
        list.display();
    }
}
