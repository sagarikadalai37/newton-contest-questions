import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashMap<String,Integer> hs = new HashMap<String,Integer>();
        int count = 0;
        for(int i = 0;i<n ;i++){
            String name = scan.next();
            int year = scan.nextInt();
            char x = name.charAt(0);
            char y = name.charAt(name.length() - 1);
            int yr1 = year % 10;
            year = year / 10;
            int yr2 = year % 10;
            String ans = "" + x+y + yr1 +yr2;
            //System.out.print(ans);
            if(hs.containsKey(ans)){
                count++;
            }else{
                hs.put(ans,1);
            }
        }
        System.out.print(count);
        
    }
}
