import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int rec(long [] arr, long sum,int i){
        if(i == arr.length){
            if(sum == 0)
            return 0;
            else
            return 1;
        }
        return rec(arr,sum-arr[i],i+1)*rec(arr,sum+arr[i],i+1);
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long K = scan.nextLong();
        long[] arr = new long[N];
        for(int i = 0;i<N;i++){
            arr[i] = scan.nextLong();
        }
        int sum = rec(arr,K,0);
        if(sum == 0)
        System.out.println("YES");
        else
        System.out.println("NO");
        
    }
}
