import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    static final int MOD = 1000000007;
    static long getCount(int arr[], int n) {
        long cntPrevPos = 0, cntPrevNeg = 0;
        if(arr[0] < 0) {
            cntPrevNeg = 1;
        }
        else if(arr[0] > 0) {
         cntPrevPos = 1;
        }

        

        for(int i=1; i<n; i++) {

            long cntCurrPos = 0, cntCurrNeg = 0;

            if(arr[i] < 0) {

                cntCurrNeg = 1 + cntPrevPos + cntPrevNeg;

                cntCurrNeg %= MOD;

                cntCurrPos = cntPrevNeg + cntPrevPos;

                cntCurrPos %= MOD;

            }

            else if(arr[i] > 0) {

                cntCurrNeg = cntPrevNeg + cntPrevNeg;

                cntCurrNeg %= MOD;

                cntCurrPos = 1 + cntPrevPos + cntPrevPos;

                cntCurrPos %= MOD;

            }

            else

                continue;

            

            cntPrevNeg = cntCurrNeg;

            cntPrevPos = cntCurrPos;

        }

        

        return cntPrevPos;

    }

    

    public static void main(String args[]) throws IOException {

        BufferedReader br 

                = new BufferedReader(new InputStreamReader(System.in));

        

        

       

            int n = Integer.parseInt(br.readLine());

            String str[] = br.readLine().split(" ");

            int arr[] = new int[n];

            

            for(int i=0; i<n; i++)

                arr[i] = Integer.parseInt(str[i]);

            

            System.out.println(getCount(arr, n));

        

    }

}
