import java.util.*;
import java.io.*;

class Main {

    public static void main (String[] args) 

    {

       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

       int[] arr = new int[n];

       for(int i=0;i<n-1;i++)

       {

           arr[i] = sc.nextInt();

       }
    //    System.out.print(Arrays.toString(arr));

       long ans = MaxCandies(arr,n);

       System.out.println(ans);

    }

    public static long MaxCandies(int[] arr, int n)

    {

        int[] newArr = new int[n];

        newArr[0]= arr[0];

        newArr[n-1] = arr[n-2];

        for(int i=1;i<=n-2;i++)

        {

            newArr[i]=Math.min(arr[i-1],arr[i]);

        }

        long sum =0;

        for(int i=0;i<newArr.length;i++)

        {

            sum+=newArr[i];

        }

        return sum;

    }

}
