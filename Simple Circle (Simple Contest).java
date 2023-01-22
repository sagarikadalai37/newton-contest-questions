import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        long sum = a[n-1];
        for(int i = n-2, j = 1; j < n-1; j += 2, i--) {
            sum = sum + 2*a[i];
        }
        System.out.print(sum);
    }
}
