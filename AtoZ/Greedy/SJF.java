//Shortest Job First is a CPU Scheduling policy
//Basic idea: Always execute the process with the smallest burst time first
// Greedy: Execute the process with the smallest burst time first.
// Sort burst times → calculate waiting time.
package AtoZ.Greedy;
import java.util.*;
public class SJF {
    public static void main(String[] args) {
        int[] burstTime = {6, 2, 8, 3};
        Arrays.sort(burstTime);
        int waitingTime = 0;
        int totalWtTime = 0;
        for(int time : burstTime){
            totalWtTime += waitingTime;
            waitingTime += time;
        }
        int avgWtTime = totalWtTime / burstTime.length;
        System.out.println("Average Waiting Time: " + avgWtTime);
    }
}
