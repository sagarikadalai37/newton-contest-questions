import java.util.Scanner;
import java.util.Vector;
class Pair {
    Integer key;
    Integer value;
    Pair(Integer key, Integer value) {
        this.key = key;
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Vector<Pair> nums = new Vector<Pair>();
        Long result = 0L;
        while (N > 0) {
            Pair p = new Pair(in.nextInt(), in.nextInt());
            nums.add(p);
            result += p.value;
            N = N-1;
        }
        in.close();
        System.out.println(result);
    }
}
