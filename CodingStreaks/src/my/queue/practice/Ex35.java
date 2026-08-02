package my.queue.practice;

import java.util.LinkedList;
import java.util.Queue;

public class Ex35 {

	class Process {
		int id;
		int burstTime;

		Process(int id, int burstTime) {
			this.id = id;
			this.burstTime = burstTime;
		}
	}

	public class CPUSchedulingSimulation {

	    public static void schedule(Queue<Process> queue) {

	        int currentTime = 0;

	        while (!queue.isEmpty()) {

	            Process process = queue.poll();

	            System.out.println("Executing Process P" + process.id);

	            currentTime += process.burstTime;

	            System.out.println("Completion Time: " + currentTime);
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {

	        Queue<Process> queue = new LinkedList<>();

	        // Adding processes (FCFS order)
	        queue.add(new Process(1, 5));
	        queue.add(new Process(2, 3));
	        queue.add(new Process(3, 4));

	        System.out.println("CPU Scheduling Simulation:");

	        schedule(queue);
	    }
	}
