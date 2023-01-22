import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
         for(int i = 0;i<n;i++){
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        
          System.out.print(a[(n-1)/2]);
    }
        
}
