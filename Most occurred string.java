import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < num; i++) {
            String str = sc.next();
            int count = map.getOrDefault(str, 0);
            map.put(str, count + 1);
        }
        String ans = null;
        int max = Integer.MIN_VALUE;
        for (String s : map.keySet()) {
            int count = map.get(s);
            if (count > max) {
                max = count;
                ans = s;
            } else if (count == max) {
                ans = ans.compareTo(s) > 0 ? ans : s;
            }
        }
        System.out.println(ans);
    }
}
