import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.lang.*;
import java.util.Arrays;
// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args)
   {
                      
	 Scanner scan=new Scanner(System.in);
	 int M = scan.nextInt();
	 int N = scan.nextInt();
	 int q = scan.nextInt();
	 int arr[][]=new int[M][N];
	 HashMap<Integer,Integer> ar = new HashMap<>();
	 for(int i = 0; i< M ; i++){
		 for(int j = 0; j <N ; j++){
			 arr[i][j] = scan.nextInt();
			 ar.put(arr[i][j],1);
		 }
	 }
	 for(int i = 0; i<q ;i++){
		 int r = scan.nextInt();
		 if(ar.containsKey(r)){
			 System.out.println("Yes");
		 }else{
			 System.out.println("No");
		 }
	 }
      
   }
}
