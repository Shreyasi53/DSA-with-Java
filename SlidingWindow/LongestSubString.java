package SlidingWindow;
import java.util.*;
public class LongestSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = sc.nextLine();
        System.out.println("Enter k");
        int k = sc.nextInt();
        int result = longestSubstring(s,k);
        System.out.println("Longest substring length =" + result);
    }

    static int longestSubstring(String s, int k){
        int low = 0;
        int high = 0;
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(high < s.length()){
            //add current character
            char ch = s.charAt(high);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            // If distinct characters > k, shrink window
            while (map.size() > k) {
                char left = s.charAt(low);
                map.put(left, map.get(left) - 1);
                if (map.get(left) == 0) {
                    map.remove(left);
                }
                low++;
            }
            // Current window has at most k distinct characters
            res = Math.max(res, high - low + 1);
            high++;
        }
        return res;
    }
}
