package my.collection.linkedlist.practice;

class Node58 {
	String url;
	Node58 prev, next;

	Node58(String url) {
		this.url = url;
		prev = next = null;
	}
}

public class Ex114 {
	Node58 current;

	Ex114(String homepage) {
	        current = new Node58(homepage);
	    }

	void visit(String url) {
		Node58 newNode = new Node58(url);
		current.next = newNode;
		newNode.prev = current;
		current = newNode;
	}

	void back() {
		if (current.prev != null) {
			current = current.prev;
		}
		System.out.println("Current Page: " + current.url);
	}

	void forward() {
		if (current.next != null) {
			current = current.next;
		}
		System.out.println("Current Page: " + current.url);
	}

	void show() {
		System.out.println("Current Page: " + current.url);
	}

	public static void main(String[] args) {
		Ex114 browser = new Ex114("google.com");

		browser.visit("facebook.com");
		browser.visit("youtube.com");
		browser.back();
		browser.back();
		browser.forward();
		browser.show();
	}
}
