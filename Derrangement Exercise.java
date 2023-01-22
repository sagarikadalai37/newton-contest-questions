import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<N;i++){
            A[i] = scan.nextInt();
            set.add(A[i]);
        }
     
      if(set.size() != N){
          System.out.println("NO");
      }else{
          System.out.println("YES");
      }
    }
}
