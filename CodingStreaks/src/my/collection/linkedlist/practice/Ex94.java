package my.collection.linkedlist.practice;

public class Ex94 {

    class node42 {
        int data;
        node42 next;

        node42(int data) {
            this.data = data;
            this.next = null;
        }
    }

    node42 insert(node42 head, int data) {
        node42 newNode = new node42(data);
        if (head == null) return newNode;
        node42 temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
        return head;
    }

    void secondMiddle(node42 head) {
        node42 slow = head;
        node42 fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println(slow.data);
    }

    public static void main(String[] args) {
        Ex94 list = new Ex94();
        node42 head = null;

        head = list.insert(head, 1);
        head = list.insert(head, 2);
        head = list.insert(head, 3);
        head = list.insert(head, 4);
        head = list.insert(head, 5);
        head = list.insert(head, 6);

        list.secondMiddle(head); // Output: 4
    }
}