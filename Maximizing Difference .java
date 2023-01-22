import java.io.*;
import java.util.*;



class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

         int[] arr2 = new int[n];
         for(int i=0; i<n; i++){
             arr2[i] = sc.nextInt();
         }

          Arrays.sort(arr1);
          Arrays.sort(arr2);

          int ptr1 = 0;
          int ptr2 = n-1;

          for(int i=0; i<n; i++){
              if(arr1[ptr1] < arr2[ptr2]){
                     int temp1 = arr1[ptr1];
                     int temp2 = arr2[ptr2];
                     arr1[ptr1] = temp2;
                     arr2[ptr2] = temp1;
                     ptr1++;
                     ptr2--;
              }
          }

          long sum1 = 0;
          long sum2 = 0;

          for(int i=0; i<n; i++){
              sum1 += arr1[i];
              sum2 += arr2[i];
          }
          System.out.println(sum1-sum2);
    }
}
