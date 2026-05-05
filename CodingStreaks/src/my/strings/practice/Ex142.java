package my.strings.practice;

class TextEditor {
	char[] text;
	int length;

	char[][] history;
	int top;

	public TextEditor(int maxSize, int maxUndo) {
		text = new char[maxSize];
		length = 0;

		history = new char[maxUndo][maxSize];
		top = -1;
	}

	
	// Save current state to history stack
	private void saveState() {
		top++;
		for (int i = 0; i < length; i++) {
			history[top][i] = text[i];
		}
		history[top][length] = '\0'; // mark end
	}

	// INSERT
	public void insert(String str) {
		saveState();
		for (int i = 0; i < str.length(); i++) {
			text[length++] = str.charAt(i);
		}
	}

	// DELETE last k characters
	public void delete(int k) {
		saveState();
		length -= k;
		if (length < 0)
			length = 0;
	}

	// UNDO
	public void undo() {
		if (top < 0)
			return;

		int i = 0;
		while (history[top][i] != '\0') {
			text[i] = history[top][i];
			i++;
		}
		length = i;
		top--;
	}

	// PRINT
	public void print() {
		for (int i = 0; i < length; i++) {
			System.out.print(text[i]);
		}
		System.out.println();
	}
}

public class Ex142 {
	    public static void main(String[] args) {
	        TextEditor editor = new TextEditor(100, 50);

	        editor.insert("hello");
	        editor.print(); // hello

	        
	        editor.insert(" world");
	        editor.print(); // hello world

	        editor.delete(5);
	        editor.print(); // hello 

	        editor.undo();
	        editor.print(); // hello world

	        editor.undo();
	        editor.print(); // hello
	    }
	}
