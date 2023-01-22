import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
        int a[] = new int[n];
        for(int  i = 0;i<n;i++){
            a[i] = scan.nextInt();
        } 
        int time = 1;
        int i = 1;
        while(i >= 0){
            int val = a[i] -time;
            time++;
            if(val <= 0 ){
                System.out.println(i+1);
                break;
            }else{
                if(i == n-1){
                    i = 0;
                }else{
                    i++;
                }
            }
        }
    }
}
