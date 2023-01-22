import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static boolean check(int x, int buildings[]){
        int energy = x;
        int n = buildings.length;
        for(int i = 0; i<n ; i++){
            energy += energy - buildings[i];
            if(energy >= 100000) return true;
            if(energy < 0 )return false;
        }
        return true;
    }
    public static void main (String[] args) {
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       int[] buildings = new int[n];
       for(int i = 0 ; i < n ; i++) {
           buildings[i] = scan.nextInt();
       }
       int L  = 0, R = 100000;
       int ans = 0;
      while(L <= R){
          int M = L + (R-L)/2;
          if(check(M,buildings)){
              R = M - 1;
              ans = M;
          }else{
              L = M+1;
          }
      }
        System.out.print(ans);
    }
}
