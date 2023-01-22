import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i<n;i++){
            for(int j = 0; j<n;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        int psum = 0;
        int ssum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j)
                psum = psum + arr[i][j];
                if((i+j)  == (n-1)){
                 ssum = ssum+arr[i][j];   
                }
            }
        } 
        System.out.println(psum + " " + ssum);
    }
}
