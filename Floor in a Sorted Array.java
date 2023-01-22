import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while(T-->0){
            int n = scan.nextInt();
            long k = scan.nextLong();
            long arr[] = new long[n];
            for(int i= 0 ;i<n;i++){
                arr[i] = scan.nextInt();
            }
            System.out.println(findFloor(arr,n,k));
        }
    }
    static int findFloor(long arr[],int n,long x){
        int first = 0;
        int last = arr.length-1;
        while(first < last){
            int mid = (first +last)/2;
            if(arr[mid]==x){
                return mid;
            } else if(arr[mid]>x){
                last = mid-1;
            } else if(arr[mid]< x){
                first = mid+1;
            }
        }
        for(int i = last;i>=0;i--){
            if(x>=arr[i]){
                return i;
            }
        }
        return -1;
    }
}
