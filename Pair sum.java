import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        long sum = 0;
        for(int i = n-1; i>0; i--){
            sum+= arr[i]*i;
        }
        System.out.println(sum);
    }
}
