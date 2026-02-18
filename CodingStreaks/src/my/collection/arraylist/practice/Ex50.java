package my.collection.arraylist.practice;

import java.util.Scanner;

class Node9 {
    int data;
    Node9 next;
    Node9(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Ex50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();

        System.out.println("Enter the node values:");
        Node9 head = new Node9(sc.nextInt());
        Node9 temp = head;
        for(int i = 1; i < n; i++) {
            temp.next = new Node9(sc.nextInt());
            temp = temp.next;
        }

        head = rearrangeOddEven(head);

        System.out.println("Rearranged linked list:");
        temp = head;
        while(temp != null) {
            System.out.print(temp.data);
            if(temp.next != null) System.out.print(" ");
            temp = temp.next;
        }
    }

    static Node9 rearrangeOddEven(Node9 head) {
        if(head == null || head.next == null) return head;

        Node9 odd = head;
        Node9 even = head.next;
        Node9 evenHead = even;

        while(even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
