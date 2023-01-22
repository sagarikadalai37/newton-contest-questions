import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while(t>0){

            int n = in.nextInt();

            int arr[]= new int[n];

            for(int i=0; i<n; i++){
                arr[i]=in.nextInt();
            }

            // HashMap<Integer,Integer> hm = new HashMap<>();

            // for(int num: arr){
            //     if(hm.containsKey(num)){
            //         hm.put(num,hm.get(num)+1);
            //     }else{
            //         hm.put(num,1);
            //     }
            // }

            // System.out.println(hm);

            // boolean ans = false;

            // for(Map.Entry<Integer,Integer> e: hm.entrySet()){
            //     if(e.getValue()> (double)n/2){
            //         System.out.println(e.getKey());
            //         ans=true;
            //     }
            // }

            // if(ans == false){
            //     System.out.println(-1);
            // }

            int vote=0;
            int candidate=-1;

            for(int i=0; i<n; i++){
                if(vote==0){
                    candidate=arr[i];
                    vote=1;
                }else{
                    if(arr[i]==candidate){
                        vote++;
                    }else{
                        vote--;
                    }
                }
            }

            vote=0;
            for(int i=0; i<n; i++){
                if(arr[i]==candidate){
                    vote++;
                }
            }

            if(vote>(double)n/2){
                System.out.println(candidate);
            }else{
                System.out.println(-1);
            }
             System.gc();
            t--;
        }

    }
}
