package AtoZ.Greedy;
import java.util.*;
public class jobSeq {
    static class Job{
        char id;
        int deadline;
        int profit;
        Job(char id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {

        Job[] jobs = {
                new Job('A', 2, 100),
                new Job('B', 1, 19),
                new Job('C', 2, 27),
                new Job('D', 1, 25),
                new Job('E', 3, 15)
        };
        // Sort jobs by profit (highest first)
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);
        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }
        char[] slot = new char[maxDeadline + 1];
        int totalProfit = 0;
        // Schedule jobs
        for (Job job : jobs) {
            // Find latest available slot
            for (int j = job.deadline; j > 0; j--) {
                if (slot[j] == '\0') {
                    slot[j] = job.id;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        System.out.println("Job Sequence:");
        for (int i = 1; i <= maxDeadline; i++) {
            if (slot[i] != '\0') {
                System.out.print(slot[i] + " ");
            }
        }

        System.out.println("\nTotal Profit: " + totalProfit);
    }
}
