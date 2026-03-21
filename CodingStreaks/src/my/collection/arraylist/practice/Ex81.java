package my.collection.arraylist.practice;

import java.util.ArrayList;

class LRUCache {
	private int capacity;
	private ArrayList<Integer> cache;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		this.cache = new ArrayList<>();
	}

	public int get(int key) {
		if (cache.contains(key)) {
			cache.remove((Integer) key);
			cache.add(key);
			return key;
		} else {
			return -1;
		}
	}

	public void put(int key) {
		if (cache.contains(key)) {
			cache.remove((Integer) key);
		} else if (cache.size() == capacity) {
			cache.remove(0);
		}
		cache.add(key);
	}

	public void printCache() {
		System.out.println(cache);
	}
}

public class Ex81 {
	public static void main(String[] args) {
		LRUCache lru = new LRUCache(3);
		lru.put(1);
		lru.put(2);
		lru.put(3);
		lru.printCache();

		lru.get(2);
		lru.printCache();

		lru.put(4);
		lru.printCache();
	}
}
