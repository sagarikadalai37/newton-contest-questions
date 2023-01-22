import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count = recursive(n, 0, false, false, false);
        System.out.println(count);
    }

    private static int recursive(long n, long num, boolean three, boolean four, boolean five) {
        if(num > n){
            return 0;
        }
        int count = 0;
        if(three && four && five){
            count ++;
        }
        count += recursive(n, num*10 + 3, true, four, five);
        count += recursive(n, num*10 + 4, three, true, five);
        count += recursive(n, num*10 + 5, three, four, true);
        return count;
    }
}
