import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         int arr[] = new int[n];
         for(int i = 0; i< n ; i++ ){
             arr[i] = scan.nextInt();
          }
          Arrays.sort(arr);
          int max = 1;
          for(int i = 0; i <n ;i++) {
              int val = arr[i] + arr[n-i-1];
              if(max < val){
                  max = val;
              }
          }  
          System.out.println(max);          
    }
}
