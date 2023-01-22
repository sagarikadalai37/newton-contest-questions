import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        long P = scan.nextLong();
        long count=0;
        if(P > 0 && N > 0){
            count = (N + P) * P * 4;
        }
        System.out.println(count);

    }
}
