import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();
        if(M % 2 != 0 || N % 2 != 0){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}
