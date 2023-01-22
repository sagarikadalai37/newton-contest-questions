import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
   public static int solve(int start,int sum_till_now, int target){
        if(sum_till_now > target){
            return 0;

        }
        if(sum_till_now == target){
            return 1;
        }
        int sum = 0;
        for(int i = start; i<= target-sum_till_now;i++){
            sum += solve(i+1,sum_till_now+i, target);
        }
        return sum;
    }
    public static void main (String[] args) {
       Scanner scan = new Scanner(System.in);
       int t = scan.nextInt();
       while(t --> 0){
           int n = scan.nextInt();
           if(n<= 1){
               System.out.println(n);
               continue;
           }
           int ans = solve(1,0,n);
           System.out.println(ans);
       } 
    }
}
