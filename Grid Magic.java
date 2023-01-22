import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            grid[i] = sc.next().toCharArray();
        }
        char diagonalChar = grid[0][0];
        char nonDiagonalChar = '\0';
        boolean isMagical = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i == n - j - 1) {
                    if (grid[i][j] != diagonalChar) {
                        isMagical = false;
                        break;
                    }
                } else {
                    if (nonDiagonalChar == '\0') {
                        nonDiagonalChar = grid[i][j];
                    } else if (grid[i][j] != nonDiagonalChar) {
                        isMagical = false;
                        break;
                    }
                }
            }
            if (!isMagical) {
                break;
            }
        }
              if(diagonalChar==nonDiagonalChar)
        {
            isMagical = false;
        }

        if (isMagical) {
            System.out.println("YES");
        } else {
            System.out.println("NO");}}
}
