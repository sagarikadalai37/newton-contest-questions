import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();
     int [][] arr = new int[n][n];
     for(int i = 0; i < n ;i++){
         for(int j = 0; j < n;j++){
             arr[i][j] = scan.nextInt();
         }
     }
     int count = 0;
     int mincol = 0;
     int minrow = 0;
     int maxrow = n-1;
     int maxcol = n-1;
     while(count < n*n){
         for(int i = minrow ; i <= maxrow;i++){
             System.out.print(arr[i][mincol]+" ");
             count++;
         }
         for(int i = mincol+1; i <= maxcol;i++){
             System.out.print(arr[maxrow][i]+" ");
             count++;
         }
         for(int i = maxrow-1;i >= minrow;i--){
             System.out.print(arr[i][maxcol]+" ");
             count++;
         }
         for(int i=maxcol-1;i > mincol;i--){
             System.out.print(arr[minrow][i]+" ");
             count++;
         }
         minrow++;
         mincol++;
         maxrow--;
         maxcol--;
     }
    }
}
