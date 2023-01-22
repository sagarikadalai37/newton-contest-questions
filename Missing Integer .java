import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     static void smallstNonNeg(int Arr[] , int N){
        int smNoNNeg = 0;
        Boolean[] hash =  new Boolean[N + 1];
        Arrays.fill(hash,false);
        for(int i = 0;i<N; i++){
            if(Arr[i] >=0 && Arr[i] < N){
                hash[Arr[i]] = true;
            }
            while(hash[smNoNNeg]){
                smNoNNeg++;
            }
            System.out.println(smNoNNeg + " ");

        }
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] Arr= new int[N];
        for(int i=0;i<N;i++){
            Arr[i] = scan.nextInt();
        }
        smallstNonNeg(Arr,N);
     }
}

/*class Main{
    public static void main(String[] agrs){
        scanner scan = new Scanner(System.in);
        int arr[] = new int[200001];
        int n,num;
        int index =0;
        n = scan.nextInt();
        for(int i = 0; i < n; i++){
            num = scan.nextInt();
            arr[num] = 1;
            while(arr[index] != 0){
                index++;
            }
            System.out.print(index);
        }
    }
}*/
