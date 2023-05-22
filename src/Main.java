import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String input = "Sanndalls";
        System.out.println(isPermutationOfPalindrome(input));
    }

    public static boolean isPermutationOfPalindrome(String input) {
        // Remove whitespace and convert to lowercase
        input = input.replaceAll("\\s+", "").toLowerCase();

        // Count the frequency of each character
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        // Check the count of odd frequencies
        int oddCount = 0;
        for (int count : charCount.values()) {
            if (count % 2 != 0) {
                oddCount++;
                if (oddCount > 1) {
                    return false;
                }
            }
        }

        return true;
    }
}