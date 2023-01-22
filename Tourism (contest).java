import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
         int[] arr = new int[N];
         for(int i = 0; i < N ; i++){
             arr[i] = scan.nextInt();
         }

         long sum = 0;
         for(int i= 1 ; i < N;i++){
             int temp = arr[i] - arr[i-1];
             sum = sum + Math.min(temp*A,B);
         }
         System.out.println(sum);
    }
}
