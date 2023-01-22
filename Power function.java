import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i= 0; i<T;i++){
          double X = scan.nextDouble();
          int N = scan.nextInt();
          double val = Math.pow(X,N);
          System.out.println(String.format("%.2f" , val));
        }
    }
}
