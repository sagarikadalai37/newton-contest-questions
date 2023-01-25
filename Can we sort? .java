import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       long[] a = new long[n];
       for(int i = 0;i<n;i++){
           a[i] = scan.nextLong();
       }
       boolean flag = false;
       for(int i = 0;i<n-1;i++){
           if(a[i] + a[i+1] % 2 == 0){
               a[i+1] = a[i];
           }else{
               a[i] = a[i+1];
           }
       }
       for(int i = 0;i<n-1;i++){
           if(a[i] <= a[i+1]){
               flag = true;
           }

       }
       if(flag)
       System.out.print("YES");
       else
       System.out.print("NO");
     

    }
}
