package task.scheduling.system;

import java.util.LinkedList;
import java.util.List;

public class Solution1 {

    public static void scheduleUsingLinkedList(List<Job> jobs) {

        LinkedList<Job> queue = new LinkedList<>();

        // Add tasks to the LinkedList
        for (Job job : jobs) {
            queue.addLast(job);
        }

        System.out.println("\nSolution 1: LinkedList FIFO Scheduling");
        System.out.println("--------------------------------------");

        // Process tasks in arrival order
        while (!queue.isEmpty()) {
            Job currentJob = queue.removeFirst();
            System.out.println("Processing: " + currentJob);
        }
    }
}