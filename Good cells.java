import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        int count = 0;
        for(int i=1;i<m-1;i++ ){
            for(int j=1;j<n-1;j++){
                int left = arr[i][j-1];
                int right = arr[i][j+1];
                int top = arr[i-1][j];
                int buttom = arr[i+1][j];
                if(left == 1 && right == 1 && top ==1 && buttom == 1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
