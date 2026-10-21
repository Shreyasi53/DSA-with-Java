package AtoZ.Greedy;
import java.util.*;
public class NMeetingInOneRoom {
    static class Meeting{
        int start;
        int end;
        Meeting(int start, int end){
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};
        int n = start.length;
        Meeting[] meetings = new Meeting[n];
        //create meetings
        for(int i = 0; i < n; i++){
            meetings[i] = new Meeting(start[i], end[i]);
        }
        //sort by ending time
        Arrays.sort(meetings, (a,b)->a.end - b.end);
        int count = 0;
        int lastEndTime = -1;
        // Select maximum number of non-overlapping meetings
        for (Meeting meeting : meetings) {
            if (meeting.start > lastEndTime) {
                count++;
                lastEndTime = meeting.end;
            }
        }
        System.out.println("Maximum number of meetings: " + count);
    }
}
