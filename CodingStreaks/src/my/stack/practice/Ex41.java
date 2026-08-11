package my.stack.practice;

import java.util.Stack;

public class Ex41 {

	private Stack<String> backStack;
	private Stack<String> forwardStack;
	private String currentPage;

	public Ex41(String homepage) {

	        backStack = new Stack<>();
	        forwardStack = new Stack<>();

	        currentPage = homepage;
	    }

	// Visit a new page
	public void visit(String page) {

		backStack.push(currentPage);

		currentPage = page;

		// Forward history is cleared
		forwardStack.clear();
	}

	// Go back
	public void back() {

		if (backStack.isEmpty()) {
			System.out.println("No previous page");
			return;
		}

		forwardStack.push(currentPage);

		currentPage = backStack.pop();
	}

	// Go forward
	public void forward() {

		if (forwardStack.isEmpty()) {
			System.out.println("No forward page");
			return;
		}

		backStack.push(currentPage);

		currentPage = forwardStack.pop();
	}

	// Display current page
	public void display() {

		System.out.println("Current Page: " + currentPage);
	}

	public static void main(String[] args) {

		Ex41 browser = new Ex41("google.com");

		browser.display();

		browser.visit("youtube.com");
		browser.visit("github.com");
		browser.visit("stackoverflow.com");

		browser.display();

		browser.back();
		browser.display();

		browser.back();
		browser.display();

		browser.forward();
		browser.display();

		browser.visit("wikipedia.org");
		browser.display();

		browser.forward();
	}
}
