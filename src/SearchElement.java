

public class SearchElement {
    Node head;
    boolean search(int key){

        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                System.out.print("True");
                return true;
            }
            temp=temp.next;

        }
        System.out.println("False");
        return false;
    }
    void insetAtHead(int data){
        Node newNode =new Node(data);
        newNode.next=head;
        head=newNode;
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
        SearchElement list=new SearchElement();
        list.insetAtHead(6);
        list.insetAtHead(7);
        list.insetAtHead(7);
        list.insetAtHead(12);
        System.out.print("Linked List :");
        list.display();
        list.search(7);


    }

}
