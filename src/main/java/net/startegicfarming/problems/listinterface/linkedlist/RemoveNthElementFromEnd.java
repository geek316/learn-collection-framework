package net.startegicfarming.problems.listinterface.linkedlist;

public class RemoveNthElementFromEnd {
    static void main() {

        System.out.println("Remove Nth Element from end");

        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);

        System.out.print("Original : ");
        printList(head1);

        int n = 2;
        System.out.println("Removing " + n + "element from list");
        head1 = removeNth(head1, n);

        System.out.print("After removing " + n + "th from end: ");
        printList(head1);

    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static Node removeNth(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;

        Node fast = dummy;
        Node slow = dummy;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}
