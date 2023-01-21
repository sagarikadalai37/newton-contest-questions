import java.io.*;
import java.util.*;



class Main {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();

        long[] arr = new long[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        int low = 0;
        int high = N-1;
        long count = 0;

        while(low<high){
            long num = arr[low]*arr[high];
            if(num>K){
                count += high-low;
                high--;
            } else {
                low++;
            }
        }
        System.out.println(count);
    }
}
