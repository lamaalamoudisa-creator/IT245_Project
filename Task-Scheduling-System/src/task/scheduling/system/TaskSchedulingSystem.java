package task.scheduling.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskSchedulingSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Job> jobs = new ArrayList<>();

        System.out.println("================================");
        System.out.println("     Task Scheduling System");
        System.out.println("================================");

        System.out.print("Enter number of tasks: ");
        int numberOfTasks = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= numberOfTasks; i++) {

            System.out.println("\nTask " + i);

            System.out.print("Enter task name: ");
            String name = input.nextLine();

            System.out.print("Enter task priority: ");
            int priority = input.nextInt();
            input.nextLine();

            jobs.add(new Job(name, priority));
        }

        System.out.println("\n================================");
        System.out.println("Entered Tasks");
        System.out.println("================================");

        for (Job job : jobs) {
            System.out.println(job);
        }

        // Run Solution 1
        Solution1.scheduleUsingLinkedList(jobs);

        // Run Solution 2
        Solution2.scheduleUsingPriorityQueue(jobs);

        input.close();
    }
}