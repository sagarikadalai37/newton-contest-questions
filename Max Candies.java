//Given a 2*N matrix in which each cell contains some candies in it.
//You are at the top left corner of the matrix and want to reach to the bottom right corner of the matrix 
//i. e from (1, 1) to (2, N).
//You can only move right or down. You have to find the maximum number of candies you can collect in you jouney.

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
