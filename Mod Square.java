import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         int arr[] = new int[n];
         for(int i = 0;i<n;i++){
             arr[i] = scan.nextInt();
         } 
         Arrays.sort(arr);
         int temp = n-1;
         while(temp>0){
             if(arr[temp] == arr[temp-1]){
                 temp--;
             }else{
                 System.out.print(arr[temp-1]%arr[temp]);
                 return;
             }
         }
         System.out.print("0") ;          
    }
}
