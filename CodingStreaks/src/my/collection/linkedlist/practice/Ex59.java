package my.collection.linkedlist.practice;

class Node11 {
    int data;
    Node11 next;

    Node11(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Ex59 {

    public static void removeLoop(Node11 head) {

        if (head == null || head.next == null)
            return;

        Node11 slow = head;
        Node11 fast = head;

        boolean loopExists = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                loopExists = true;
                break;
            }
        }

        if (!loopExists)
            return;

        slow = head;

        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
            return;
        }

        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }

        fast.next = null;
    }

    public static void main(String[] args) {

        Node11 head = new Node11(10);
        head.next = new Node11(20);
        head.next.next = new Node11(30);
        head.next.next.next = new Node11(40);
        head.next.next.next.next = head.next; // loop created (40 -> 20)

        removeLoop(head);

        System.out.println("Loop removed successfully");
    }
}