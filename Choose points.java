import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        String[] line1Arr = line1.split(" ");
        long n = Long.parseLong(line1Arr[0]);
        long d = Long.parseLong(line1Arr[1]);
        long[] valueArr = new long[(int)n];
        String line2 = br.readLine();
        String[] line2Arr = line2.split(" ");
       for(int i=0;i<n;i++){
           valueArr[i] = Long.parseLong(line2Arr[i]);
       }
       Arrays.sort(valueArr);
       System.out.println(choosePoint(valueArr,n,d));
    }

    static long choosePoint(long[] a, long n , long d){
        long ways = 0;
        if(d==n){
            return 0;
        }
        for(int i =0; i < n ;i++){
            long higherInded = upperLimit(a,0,n,a[i]+d);
            long numberOfElements = higherInded - (i+1);
            if(numberOfElements >= 2){
                ways += (numberOfElements * (numberOfElements - 1) / 2); 
            }
        }
        return ways;
    }
    static long upperLimit(long[] a ,long low , long high , long d){
        while(low < high ){
            long middle = (long)low + (high-low)/2;
            if(a[(int)middle] > d)
            high = middle;
            else 
            low = middle + 1;
        }
        return low;
    }


}
