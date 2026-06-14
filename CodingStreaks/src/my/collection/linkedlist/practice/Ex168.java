package my.collection.linkedlist.practice;

public class Ex168 {

	class ListNode37 {
		int val;
		ListNode37 next;
	}

	public class Ex97 {

	    public static ListNode37 splitAlternatingGroups(ListNode37 head) {

	        ListNode37 dummy = new ListNode37();
	        ListNode37 tail = dummy;

	        ListNode37 curr = head;

	        int groupSize = 1;
	        boolean take = true;

	        while (curr != null) {

	            ListNode37 groupStart = curr;
	            int count = 0;

	            // move groupSize steps
	            while (count < groupSize && curr != null) {
	                curr = curr.next;
	                count++;
	            }

	            // take this group
	            if (take) {
	                ListNode37 temp = groupStart;
	                int c = 0;

	                while (c < count) {
	                    tail.next = temp;   // reuse node
	                    tail = tail.next;
	                    temp = temp.next;
	                    c++;
	                }

	                tail.next = null; // break link
	            }

	            groupSize++;
	            take = !take;
	        }

	        return dummy.next;
	    }

	    // print list
	    public static void printList(ListNode37 head) {
	        while (head != null) {
	            System.out.print(head.val + " ");
	            head = head.next;
	        }
	    }

	    // test main
	    public static void main(String[] args) {

	        // 1 → 2 → 3 → 4 → 5 → 6 → 7 → 8 → 9
	        ListNode37 head = new ListNode37();
	        head.val = 1;

	        ListNode37 temp = head;
	        for (int i = 2; i <= 9; i++) {
	            temp.next = new ListNode37();
	            temp = temp.next;
	            temp.val = i;
	        }

	        ListNode37 result = splitAlternatingGroups(head);

	        System.out.print("Result List: ");
	        printList(result);
	    }
	}
