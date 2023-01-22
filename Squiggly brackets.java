import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    
        static int count = 0;
        public static void brackets(int o,int c ,int n){
            if(c == n) {
                count++;
                return;
            }
            if(o > c){
                brackets(o, c+1 ,n);
            }
            if(o < n){
                brackets(o+1,c,n);
            }
        }
        public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        brackets(0,0,n);
        System.out.print(count);
    }
}
