package lisst;

public class reverseLinkedList {
    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    Node reverse(Node node){
        Node prev = null;
        Node current = node;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
        
    }

    void printList(Node node){
        while(node != null){
            System.out.println(node.data + " ");
            node = node.next;
        }
    }

    
    static Node remove(){
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }temp.next = null;
        return head;
    }

    public static void main(String[] args) {
        reverseLinkedList linklist = new reverseLinkedList();
        linklist.head = new Node(5);
        linklist.head.next = new Node(34);
        linklist.head.next.next = new Node(78);

        linklist.printList(head);
        head=linklist.reverse(head);

        System.out.println("reverse: ");
        linklist.printList(head);
    }
}
