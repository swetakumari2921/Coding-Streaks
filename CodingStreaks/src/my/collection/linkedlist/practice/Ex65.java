package my.collection.linkedlist.practice;

class Node16 {
    int data;
    Node16 next;

    Node16(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Ex65 {

    public static Node16 rotate(Node16 head, int k) {
        if (head == null || k == 0) return head;

        Node16 tail = head;
        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        tail.next = head;

        k = k % length; 
        int stepsToNewTail = length - k;
        Node16 newTail = head;
        for (int i = 1; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        Node16 newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

    public static void printList(Node16 head) {
        Node16 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node16 head = new Node16(1);
        head.next = new Node16(2);
        head.next.next = new Node16(3);
        head.next.next.next = new Node16(4);
        head.next.next.next.next = new Node16(5);

        int k = 2;
        System.out.println("Original List:");
        printList(head);

        head = rotate(head, k);

        System.out.println("List after rotating by " + k + " nodes:");
        printList(head);
    }
}