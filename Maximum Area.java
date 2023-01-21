import java.io.*; // for handling input/output

import java.util.*; // contains Collections framework

// don't change the name of this class

// you can add inner classes if needed

class Main {

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int h=sc.nextInt();
        int v=sc.nextInt();
        int hr[]=new int[h];
        int vr[]=new int[v];
        for(int i=0;i<h;i++) hr[i]=sc.nextInt();
        for(int i=0;i<v;i++) vr[i]=sc.nextInt();
        Arrays.sort(hr);
        Arrays.sort(vr);
        long mod=1000000007;
        long a=0, b=0;
        int prev=0;
        a=Math.max(a,n-hr[h-1]);
        b=Math.max(b,m-vr[v-1]);
        for(int i:hr){
            a=Math.max(a,i-prev);
            prev=i;
        }
        prev=0;
        for(int i:vr){
            b=Math.max(b,i-prev);
            prev=i;
        }
        System.out.print((int)((a*b)%mod));
    }
}
