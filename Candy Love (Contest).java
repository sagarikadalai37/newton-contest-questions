import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
       long A = scan.nextLong();
       long B = scan.nextLong();
       long T = scan.nextLong();
       long l = 1, h = 1000000000;
       while(l<=h){
           long middle = l + (h - l )/2;
           long ans = answer(middle,A,B);
           if(ans <= T ){
               l = middle + 1 ;

           }else {
               h = middle - 1 ;
           }
       }
       if(answer(h , A, B)<= T){
           System.out.print(h);
       }else{
           System.out.print(l);
       }
        
    }
    public static long answer(long middle ,long A ,long B){
        long temp = middle, count = 0;
        while(temp > 0 ){
            count++;
            temp /= 10;
        }
        return A*middle + B*count;
    }
}
