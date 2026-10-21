package PracQues;
import java.util.*;
public class StrPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elemnets:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        //step-1 Convert every num into English word and count vowels
        //step-2 Sum up the vowels D
        //step-3 search valid pairs whose sum == D
        //Step-4 return total valid pair count into words

        //step-1
        String[] words = {
                "", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen",
                "fifteen", "sixteen", "seventeen", "eighteen",
                "nineteen", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety", "hundred"
        };
        int D = 0;
        for(int num : nums){
            String word;

            if(num == 100){
                word = "hundred";
            }else if(num <= 20){
                word = words[num];
            }else{
                int tens = (num/10)*10;
                int ones = num % 10;
                String tensWord;
                switch (tens) {
                    case 20: tensWord = "twenty"; break;
                    case 30: tensWord = "thirty"; break;
                    case 40: tensWord = "forty"; break;
                    case 50: tensWord = "fifty"; break;
                    case 60: tensWord = "sixty"; break;
                    case 70: tensWord = "seventy"; break;
                    case 80: tensWord = "eighty"; break;
                    default: tensWord = "ninety";
                }
                word = tensWord + (ones == 0 ? "" : words[ones]);
            }
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                if ("aeiou".indexOf(ch) != -1) {
                    D++;
                }
            }
        }
        // Step 2: D now contains the total number of vowels

        // Step 3: Find unordered pairs whose sum equals D
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == D) {
                    count++;
                }
            }
        }

        // Step 4: Convert pair count into words
        if (count > 100) {
            System.out.println("greater 100");
        } else {
            String[] countWords = {
                    "zero", "one", "two", "three", "four", "five",
                    "six", "seven", "eight", "nine", "ten",
                    "eleven", "twelve", "thirteen", "fourteen",
                    "fifteen", "sixteen", "seventeen", "eighteen",
                    "nineteen", "twenty", "thirty", "forty", "fifty",
                    "sixty", "seventy", "eighty", "ninety", "hundred"
            };

            if (count <= 20) {
                System.out.println(countWords[count]);
            } else if (count == 100) {
                System.out.println("hundred");
            } else {
                int tens = (count / 10) * 10;
                int ones = count % 10;

                String tensWord;
                switch (tens) {
                    case 20: tensWord = "twenty"; break;
                    case 30: tensWord = "thirty"; break;
                    case 40: tensWord = "forty"; break;
                    case 50: tensWord = "fifty"; break;
                    case 60: tensWord = "sixty"; break;
                    case 70: tensWord = "seventy"; break;
                    case 80: tensWord = "eighty"; break;
                    default: tensWord = "ninety";
                }

                System.out.println(tensWord + (ones == 0 ? "" : countWords[ones]));
            }
        }
        sc.close();
    }
}