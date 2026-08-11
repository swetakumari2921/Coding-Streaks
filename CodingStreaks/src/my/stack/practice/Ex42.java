package my.stack.practice;

import java.util.Stack;

public class Ex42 {

	static class FunctionCall {
		String functionName;

		FunctionCall(String functionName) {
			this.functionName = functionName;
		}
	}

	private Stack<FunctionCall> stack;

	public Ex42() {
		stack = new Stack<>();
	}

	// Call a function
	public void callFunction(String functionName) {

		FunctionCall call = new FunctionCall(functionName);

		stack.push(call);

		System.out.println("Calling: " + functionName);
	}

	// Return from function
	public void returnFunction() {

		if (stack.isEmpty()) {
			System.out.println("No function to return");
			return;
		}

		FunctionCall call = stack.pop();

		System.out.println("Returning from: " + call.functionName);
	}

	// Display call stack
	public void displayStack() {

		System.out.println("Call Stack:");

		for (int i = stack.size() - 1; i >= 0; i--) {
			System.out.println(stack.get(i).functionName);
		}
	}

	public static void main(String[] args) {

		Ex42 simulator = new Ex42();

		simulator.callFunction("main()");
		simulator.callFunction("calculate()");
		simulator.callFunction("multiply()");

		simulator.displayStack();

		simulator.returnFunction();
		simulator.returnFunction();

		simulator.displayStack();

		simulator.returnFunction();
		simulator.returnFunction();
	}
}
