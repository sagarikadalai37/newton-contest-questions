import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt(); // number of test cases

    while (t-- > 0) {
      int n = sc.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
      }

      // Create a map to store the frequency of each element
      Map<Integer, Integer> map = new HashMap<>();
      for (int i = 0; i < n; i++) {
        if (map.containsKey(a[i])) {
          map.put(a[i], map.get(a[i]) + 1);
        } else {
          map.put(a[i], 1);
        }
      }

      // Sort the map by value in descending order
      List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
      Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
        public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
          if (o1.getValue() != o2.getValue()) {
            return o2.getValue() - o1.getValue();
          } else {
            return o1.getKey() - o2.getKey();
          }
        }
      });

      // Print the sorted array
      for (Map.Entry<Integer, Integer> entry : list) {
        for (int i = 0; i < entry.getValue(); i++) {
          System.out.print(entry.getKey() + " ");
        }
      }
      System.out.println();
    }
  }
}
