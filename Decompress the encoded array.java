import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
 
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();
        while(t-- > 0){
            int n= scn.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = scn.nextInt();
            }
            // ArrayList <Integer>  list = new ArrayList<>();

           int len=0;
        for(int i=0;i<arr.length;i+=2){
            len+=arr[i];
        }
        int ans[]=new int[len];
        int j=0;
        for(int i=0;i<arr.length;i+=2){
            Arrays.fill(ans,j,j+arr[i],arr[i+1]);
            j+=arr[i];
        }
        for(int i=0; i<ans.length; i++){
        System.out.print(ans[i]  +" ");
        }
        System.out.println();
            }
        }
    }
