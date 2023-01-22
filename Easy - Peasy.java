import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static void lexicographically_smaller(int arr[], int n)
    {
        // To store number of even and odd integers
        int odd = 0, even = 0;

        // Find number of even and odd integers
        for (int i = 0; i < n; i++)
        {
            if (arr[i] % 2 == 1)
                odd++;
            else
                even++;
        }

        // If it possible to make
        // lexicographically smaller
        if (odd > 0 && even > 0)
            Arrays.sort(arr);

        // Print the array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
	public static void main (String[] args)throws IOException {
                      // Your code here
                      BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");

        int[] arr = new int[(int) n];
        for (int i=0; i<n;i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }
//        check(arr, n);
//        for (int i=0; i<n;i++){
//            System.out.print(arr[i] + " ");
//        }
        lexicographically_smaller(arr, n);
	}
}
