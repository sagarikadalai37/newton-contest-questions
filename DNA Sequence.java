import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static void DNASequence(String input){
        int n = input.length();
        HashSet<String> set = new HashSet<>();
        HashSet<String> res = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<=n-10 ; i++){
            String result = input.substring(i, i+10);

            if(set.contains(result)){
                res.add(result);
            }
            set.add(result);
        }
        for(String r : res){
            list.add(r);
        }
        Collections.sort(list);
        for(String r : list){
            System.out.println(r);
        }
    }

    public static void main (String[] args) {
        // Your code here
        Scanner scn = new Scanner(System.in);
        String s = scn.next();

        DNASequence(s);
    }
}
