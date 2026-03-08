package my.collection.linkedlist.practice;

class Node15 {
    int data;
    Node15 next;

    Node15(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Ex63 {

    public static Node15 findMiddle(Node15 head) {
        if (head == null)
            return head;

        Node15 slow = head;
        Node15 fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static Node15 merge(Node15 left, Node15 right) {

        if (left == null)
            return right;
        if (right == null)
            return left;

        Node15 result;

        if (left.data <= right.data) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }

        return result;
    }

    public static Node15 mergeSort(Node15 head) {

        if (head == null || head.next == null)
            return head;

        Node15 middle = findMiddle(head);
        Node15 nextOfMiddle = middle.next;

        middle.next = null;

        Node15 left = mergeSort(head);
        Node15 right = mergeSort(nextOfMiddle);

        Node15 sortedList = merge(left, right);

        return sortedList;
    }

    public static void printList(Node15 head) {
        Node15 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Node15 head = new Node15(4);
        head.next = new Node15(2);
        head.next.next = new Node15(1);
        head.next.next.next = new Node15(3);

        head = mergeSort(head);

        printList(head);
    }
}