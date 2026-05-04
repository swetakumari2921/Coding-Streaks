package my.collection.arraylist.practice;

import java.util.ArrayList;

class Node4 {
	Node4 zero;
	Node4 one;
}

class Trie {
	Node4 root = new Node4();

	void insert(int num) {
		Node4 curr = root;

		for (int i = 31; i >= 0; i--) {
			int bit = (num >> i) & 1;

			if (bit == 0) {
				if (curr.zero == null) {
					curr.zero = new Node4();
				}
				curr = curr.zero;
			} else {
				if (curr.one == null) {
					curr.one = new Node4();
				}
				curr = curr.one;
			}
		}
	}

	int query(int num) {
		Node4 curr = root;
		int ans = 0;

		for (int i = 31; i >= 0; i--) {
			int bit = (num >> i) & 1;

			if (bit == 0) {
				if (curr.one != null) {
					ans |= (1 << i);
					curr = curr.one;
				} else {
					curr = curr.zero;
				}
			} else {
				if (curr.zero != null) {
					ans |= (1 << i);
					curr = curr.zero;
				} else {
					curr = curr.one;
				}
			}
		}

		return ans;
	}
}

public class Ex129 {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(8);
		arr.add(1);
		arr.add(2);
		arr.add(12);

		Trie trie = new Trie();

		int prefixXor = 0;
		int maxXor = 0;

		trie.insert(0);

		for (int i = 0; i < arr.size(); i++) {
			prefixXor ^= arr.get(i);

			int best = trie.query(prefixXor);

			if (best > maxXor) {
				maxXor = best;
			}

			trie.insert(prefixXor);
		}

		System.out.println(maxXor);
	}
}
