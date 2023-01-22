import java.io.*;
import java.util.*;
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashSet<Integer> list1 = new HashSet<>();
        HashSet<Integer> list2 = new HashSet<>();
        HashSet<Integer> union = new HashSet<>();
        for(int i=0; i<n; i++) {
            if(sc.hasNextInt()){
                int x = sc.nextInt();
                list1.add(x);
                union.add(x);
            }
        }
        for(int i=0; i<m; i++){
            if(sc.hasNextInt()){
                int x = sc.nextInt();
                list2.add(x);
                union.add(x);
            }
        }
        int un = union.size();
        int is = list1.size()+list2.size()-un;
        int l1l2 = list1.size()-is;
        int l2l1 = list2.size()-is;
        System.out.println(un+" "+is+" "+l1l2+" "+l2l1);
    }
}
