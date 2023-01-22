import java.io.*;
import java.util.*;

class Main {
    public static void main (String[] args) {
                      Scanner sc = new Scanner(System.in);
                      int n = sc.nextInt();
                      if(n==1){
                          System.out.print("YES");
                      }else if(n <=3 ){
                          System.out.print("NO SOLUTION");
                      }else{
                        System.out.print("YES");
                      }
    }
}
