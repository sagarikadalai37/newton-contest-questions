import java.io.*;
import java.util.*;

class Main {
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
long N = sc.nextLong();
int M = sc.nextInt();
int arr[] = new int[M];
for(int i=0; i<M; i++){
arr[i] = sc.nextInt();
}

Arrays.sort(arr);

int count = 0;

for(int i=arr.length-1; i>=0; i--){

if(N >= 0){

N -= arr[i];

count++;

}

}

System.out.println(count);

}

}
