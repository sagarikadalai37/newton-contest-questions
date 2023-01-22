import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
       Scanner scan = new Scanner(System.in);
       
           int N = scan.nextInt();
           int[] A = new int[N];
           long sum = 0;
           for(int i = 0 ; i <N ;i++){
               A[i] = scan.nextInt();
               if(A[i] > 0){
                   sum = sum + A[i];
               }
           }
            System.out.println(sum);
        
}
}
