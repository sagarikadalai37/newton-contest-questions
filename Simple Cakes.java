import java.io.*; // for handling input/output
import java.util.*;// contains Collections framework
import java.util.Arrays;

// don't change the name of this class
// you can add inner classes if needed
public class Main {

    public static int removeDuplicate(int arr[],int n){
        if(n==0 || n == 1){
            return n;
        }
        int [] temp = new int[n];
        int j = 0;
        for(int i = 0; i<n-1;i++){
            if(arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        for(int i=0;i<j;i++){
            arr[i] = temp[i];
        }
      return j;
    }
    
public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        n= removeDuplicate(arr,n);
        System.out.print(n);

    }
}
