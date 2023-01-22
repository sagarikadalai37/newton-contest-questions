import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int search(int[] A,int K){
        int start = 0;
        int end = A.length-1;
        while(start <= end ){
            int mid =  (end + start) /2;
            if(A[mid] == K){
                return 1;
            }
            if(A[start] < A[mid]){
                if(A[start] <= K && A[mid] >= K){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(A[mid] <= K && A[end] >= K ) {
                    start = mid +1;
                }else{
                    end = mid -1;
                }
            }

        }
        return 0;
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        for(int i= 0;i<N;i++){
            A[i]= scan.nextInt();
        }
        int K= scan.nextInt();
        System.out.print(search(A,K));
    }
}
