package my.collection.linkedlist.practice;

class ListNode50 {
    int data;
    ListNode50 next;

    ListNode50(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Ex185 {

    static ListNode50 reverseIncreasingGroups(ListNode50 head) {
        if (head == null)
            return null;

        ListNode50 dummy = new ListNode50(0);
        dummy.next = head;

        ListNode50 prevGroupEnd = dummy;
        ListNode50 current = head;

        int groupSize = 1;

        while (current != null) {

            ListNode50 temp = current;
            int count = 0;

            while (temp != null && count < groupSize) {
                temp = temp.next;
                count++;
            }

            ListNode50 nextGroupStart = temp;

            if (count == groupSize) {

                ListNode50 groupStart = current;

                ListNode50 prev = null;
                ListNode50 curr = current;

                for (int i = 0; i < groupSize; i++) {
                    ListNode50 next = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = next;
                }

                prevGroupEnd.next = prev;
                groupStart.next = nextGroupStart;

                prevGroupEnd = groupStart;
                current = nextGroupStart;

            } else {

                ListNode50 groupStart = current;

                ListNode50 prev = null;
                ListNode50 curr = current;

                while (curr != null) {
                    ListNode50 next = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = next;
                }

                prevGroupEnd.next = prev;
                break;
            }

            groupSize++;
        }

        return dummy.next;
    }

    static void printList(ListNode50 head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null)
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ListNode50 head = new ListNode50(1);
        head.next = new ListNode50(2);
        head.next.next = new ListNode50(3);
        head.next.next.next = new ListNode50(4);
        head.next.next.next.next = new ListNode50(5);
        head.next.next.next.next.next = new ListNode50(6);
        head.next.next.next.next.next.next = new ListNode50(7);
        head.next.next.next.next.next.next.next = new ListNode50(8);
        head.next.next.next.next.next.next.next.next = new ListNode50(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode50(10);

        System.out.print("Original List: ");
        printList(head);

        head = reverseIncreasingGroups(head);

        System.out.print("After Reversing: ");
        printList(head);
    }
}