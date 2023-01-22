import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int countOper(int arr[], int n){
        int count = 0;
        int flag = 1;
        while(true){
            if(flag == 0){
                count--;
                break;
            }
            for(int i =0 ;i < n ;i++){
                if(arr[i] % 2 == 1){
                    flag = 0;
                    break;
                }
                arr[i] = arr[i]/2;
            }
            count++;
        }
        return count;
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(countOper(arr , n));
       
    }
}
