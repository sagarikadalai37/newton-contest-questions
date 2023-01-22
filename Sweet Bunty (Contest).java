import java.util.*;
class Main{
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int b = scanner.nextInt();
        int n1 = (b / 2) - 1;
        int a = (n1 * (n1 + 1)) / 2;
        System.out.println((x >= a?a:x));
    }
}
