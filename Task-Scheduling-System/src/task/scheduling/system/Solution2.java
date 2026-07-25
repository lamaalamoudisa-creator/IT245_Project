package task.scheduling.system;

import java.util.List;
import java.util.PriorityQueue;

public class Solution2 {

    public static void scheduleUsingPriorityQueue(List<Job> jobs) {

        PriorityQueue<Job> priorityQueue =
                new PriorityQueue<>(
                        (job1, job2) ->
                                Integer.compare(
                                        job2.getPriority(),
                                        job1.getPriority()
                                )
                );

        // Add tasks to the PriorityQueue
        for (Job job : jobs) {
            priorityQueue.offer(job);
        }

        System.out.println("\nSolution 2: PriorityQueue Scheduling");
        System.out.println("------------------------------------");

        // Process tasks from highest priority to lowest priority
        while (!priorityQueue.isEmpty()) {
            Job currentJob = priorityQueue.poll();
            System.out.println("Processing: " + currentJob);
        }
    }
}