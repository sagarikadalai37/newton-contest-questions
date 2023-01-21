import java.io.*;
import java.util.*;



class Main {
	public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2[] = str1.split(" ");
        int n = Integer.parseInt(str2[0]);
        int k = Integer.parseInt(str2[1]);
        String str3 = br.readLine();
        String str4[] = str3.split(" ");
        long[] arr = new long[n];
        for(int i = 0; i < n; ++i) {
            arr[i] = Long.parseLong(str4[i]);
        }
        Arrays.sort(arr);
        int i=0,j=2;
        long ans=0;
        while(j!=n){
        if(i==j-1){j++;continue;}
    if((arr[j]-arr[i])>k){i++;}
    else{
            int x = j-i;
        ans+=(x*(x-1))/2;
        j++;
    }

}
System.out.print(ans);

	}
}
