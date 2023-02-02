package lisst;

public class reverseInPairs {
    static Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            this.data=d;
            this.next=null;
        }
    }

    void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printList(){
        Node temp = head;
        System.out.println();
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node remove(){
        Node temp = head;
        while(temp != null){
            temp = temp.next;
        }temp.next = null;
        return head;
    }

    void pairReverse(){
        Node temp = head;
        while(temp != null && temp.next != null){
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }
    }

    public static void main(String[] args) {
        reverseInPairs llist = new reverseInPairs();
        llist.push(3);
        llist.push(56);
        llist.push(76);
        llist.push(34);
        llist.push(23);
        llist.push(9);
        System.out.println("normal linked list");
        llist.printList();
        System.out.println("reversed list in pairs:");
        llist.pairReverse();
        llist.printList();
    }
}
