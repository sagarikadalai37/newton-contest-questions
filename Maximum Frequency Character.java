import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();

        // Use a hashmap to store the frequency of each character
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        // Find the maximum frequency and the character associated with it
        int maxFreq = 0;
        char maxChar = '\0';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        // Check if there is more than one character with the maximum frequency
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFreq && entry.getKey() != maxChar) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(maxChar);
    }
}
