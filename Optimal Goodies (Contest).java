import java.io.*; // for handling input/output

import java.util.*; // contains Collections framework


 

// don't change the name of this class

// you can add inner classes if needed

class Main {

    public static void main (String[] args) {

        // Your code here

        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();

        int k= sc.nextInt();

        int j= sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<n;i++){

            arr.add(sc.nextInt());

        }

        int sum = arr.get(j-1);

        arr.remove(j-1);

        Collections.sort(arr);

        

        for(int i=0;i<k-1;i++){

            sum += arr.get(i);

        }

        System.out.println(sum);


 

    }

}
