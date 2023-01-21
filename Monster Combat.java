import java.io.*;
import java.util.*;



class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0 ;i<n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int j=0;
        for(int i=1; i<n; i++){
            if(arr[i]>arr[j]){
                arr[j]=0;
                j++;
            }
        }
        int count=0;
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                count++;
            }
        }
        System.out.print(count);
    }
}
