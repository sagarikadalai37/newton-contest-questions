import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            int m=s.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
            }
            Arrays.sort(arr);
            int result=0;
            for(int i=n-1;i>=0;i--){
                if(m>0){
                    m=m-arr[i];
                    result++;
                }
            }
            System.out.println(n-result);
        }
    }
}
