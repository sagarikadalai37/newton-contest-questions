import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) throws IOException {
        // Your code here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String nums[] = br.readLine().split(" ");
        int n=Integer.parseInt(nums[0]);
        int m=Integer.parseInt(nums[1]);
        long k=Long.parseLong(nums[2]);
        long ar[][]=new long[n][m];
        for(int i=0;i<n;i++){
             nums = br.readLine().split(" ");
            for(int j=0;j<m;j++){
                ar[i][j]=Long.parseLong(nums[j]);
            }
        }
        HashMap<Long,Long>hm=new HashMap<>();
            long sum=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                        long val=hm.getOrDefault((i+j)%k,0L)+ar[i][j];
                         hm.put((i+j)%k, val);
                         sum=Math.max(sum,val);
                    
                }
            }
            System.out.println(sum);
    }
}
