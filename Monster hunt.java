import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
          Scanner sc=new Scanner(System.in);

                      int N=sc.nextInt();

                      int k=sc.nextInt();

                      int count=0;

                      int[] list =new int[N];

                      for(int i=0;i<N;i++)

                      {

                          list[i]=sc.nextInt(); 

                      }

                      int j=0;

                      while(list[k] >0) {

                          j=j%N;

                          if(list[j]>0)

                          {

                              list[j]--;

                              count++;

                          }

                          j++;

                      }

                      System.out.println(count);
                      // Your code here
    }
}
