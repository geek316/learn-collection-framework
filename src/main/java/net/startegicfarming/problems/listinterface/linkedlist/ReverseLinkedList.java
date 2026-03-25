package net.startegicfarming.problems.listinterface.linkedlist;

public class ReverseLinkedList {
    static void main() {

        System.out.println("Reversing LinkedList");
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.print("Original : ");
        printList(head);

        head = reverse(head);

        System.out.print("Reversed : ");
        printList(head);
        System.out.println();
        System.out.println();

    }

    static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr!= null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
