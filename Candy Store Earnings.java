import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        long maxEarnings = 0;
        Arrays.sort(a);
        for(int i=0 ; i<k ; i++)
        {
            if(a[i] < 0)
            {
                maxEarnings += -1 * a[i];
            }
            else
            {
                break;
            }                   
        }
        System.out.println(maxEarnings);
    }
}
