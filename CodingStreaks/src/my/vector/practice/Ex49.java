package my.vector.practice;

import java.util.Vector;

public class Ex49 {
	
	    public static Vector<Integer> findSlidingWindowMaximum(
	            Vector<Integer> v, int k) {

	        Vector<Integer> result = new Vector<>();

	        if (v == null || v.isEmpty() || k <= 0 || k > v.size()) {
	            return result;
	        }

	        for (int i = 0; i <= v.size() - k; i++) {

	            int max = v.get(i);

	            // Check all elements inside the current window
	            for (int j = i; j < i + k; j++) {

	                if (v.get(j) > max) {
	                    max = v.get(j);
	                }
	            }

	            result.add(max);
	        }

	        return result;
	    }

	    public static void main(String[] args) {

	        Vector<Integer> v = new Vector<>();

	        v.add(1);
	        v.add(3);
	        v.add(-1);
	        v.add(-3);
	        v.add(5);
	        v.add(3);
	        v.add(6);
	        v.add(7);

	        int k = 3;

	        Vector<Integer> result =
	                findSlidingWindowMaximum(v, k);

	        System.out.println("Original Vector = " + v);
	        System.out.println("Window Size = " + k);
	        System.out.println("Sliding Window Maximum = " + result);
	    }
	}
