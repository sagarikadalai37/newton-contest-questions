import java.math.BigInteger;
import java.util.Scanner;

class Main {
    // a= 2 b = 8
    static long pow(long a, long b, long mod){
        if(b==1) return a;
        long ans = pow(a,b/2, mod);
        if(b%2==0){
            return (ans*ans)%mod;
        }else{
            return (( (a*ans)%mod) *ans)%mod;
        }
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long mod=1000000007;
        long ans=1;
        if(n==1){
            ans = 5;
        }
        else if(n%2==0){
            ans =  (pow(5,n/2,mod)*pow(4,n/2,mod))%mod;
        }else{
            ans = (pow(5,(n/2)+1,mod)*pow(4,n/2,mod))%mod;   
        }
        System.out.println(ans);
    }
}
