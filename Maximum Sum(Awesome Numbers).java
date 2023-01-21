import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
      Scanner inputTaker=new Scanner(System.in);

        int  n=inputTaker.nextInt();

        long sum=0;

        for(int i=0;i<n;i++){

            long inp = inputTaker.nextLong();

            if(inp>0){

                sum+=inp;

            }

        }

        System.out.println(sum);
    }
}
