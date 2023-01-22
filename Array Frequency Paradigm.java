import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner scan= new Scanner(System.in);
        int N = scan.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[N];
        for(int i = 0 ; i < N ; i++){
            arr[i] = scan.nextInt();
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
             }
             int freq[] = new int[N];
             for(int i = 0;i<N;i++){
                 freq[i] = map.get(arr[i]);
             }
             int nger[] = new int[N];
             Stack<Integer> st = new Stack<>();
             st.push(N);
             nger[N-1] =  -1;
             for(int i = N-1;i > 0; i--){
                 while(st.size() > 0 && freq[st.peek()-1] < freq[i-1]){
                     st.pop();
                 }
                 if(st.size()==0){
                     nger[i-1] = -1;
                 }else{
                     nger[i-1] = st.peek();
                 }
                 st.push(i);
             }
        for(int i = 0; i<N;i++){
            System.out.print(nger[i]+" ");
        }
    }
}
