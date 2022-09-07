import java.util.ArrayList;

public class LongestSubstringApp {
    public static void main(String[] args) {
        String[] listOfInputs = {"abcabcbb", "bbbbb", "pwwkew"};

        for (String input: listOfInputs) {
            System.out.println("\nINPUT = " + input);
            System.out.println("\nRESULT = " + findLongestSubstringLength(input));
        }
    }

    public static int findLongestSubstringLength(String str) {
        int startPointer=0, endPointer=0, max=0;
        Character charToRemove = null;
        ArrayList<Character> slicedString = new ArrayList<>();

        while (endPointer < str.length()) {
            System.out.println("\nStart pointer: " + startPointer);
            System.out.println("End pointer: " + endPointer);
            if (!slicedString.contains(str.charAt(endPointer))) {
                slicedString.add(str.charAt(endPointer));
                endPointer++;
                max = Math.max(slicedString.size(), max);
            } else {
                charToRemove = str.charAt(startPointer);
                slicedString.remove(charToRemove);
                startPointer++;
            }
            System.out.println("Current sliced string: " + slicedString);
            System.out.println("Current sliced string size: " + slicedString.size());
            System.out.println("Current max size of sliced string: " + max);
        }

        return max;
    }
}
