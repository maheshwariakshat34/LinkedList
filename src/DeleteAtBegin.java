
public class DeleteAtBegin {
    Node head;

    void deleteAtBegin() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    void insertAtHead(int data) {
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
        DeleteAtBegin list = new DeleteAtBegin();

        list.insertAtHead(3);
        list.insertAtHead(6);
        list.insertAtHead(9);
        list.insertAtHead(10);

        System.out.print("Before deletion: ");
        list.display();

        list.deleteAtBegin();

        System.out.print("After deletion: ");
        list.display();
    }
}