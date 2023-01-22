import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
       Scanner scan = new Scanner(System.in);
       int N = scan.nextInt();
       int[] entryOrder = new int[N];
       for(int i = 0; i<N;i++){
           int numStud = scan.nextInt();
           entryOrder[numStud -1] = i+1;
       }
       for(int StudentNubmer : entryOrder){
           System.out.print(StudentNubmer + " ");
       }
    }
}
