import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int result = divideIntoSubArrays(A);
        System.out.println(result);
    }

    public static int divideIntoSubArrays(int[] A) {
        int count1 = 0, count0 = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 1) count1++;
            else count0++;
        }

        if (count1 != count0) return -1;

        int result = 0;
        int currSum = 0;
        for (int i = 0; i < A.length; i++) {
            currSum += A[i] == 1 ? 1 : -1;
            if (currSum == 0) result++;
        }
        return result;
    }
}
