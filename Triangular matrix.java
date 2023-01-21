import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    
    int n = scanner.nextInt();

   
    int[][] matrix = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matrix[i][j] = scanner.nextInt();
      }
    }

   
    int upperSum = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        upperSum += matrix[i][j];
      }
    }

   
    int lowerSum = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        lowerSum += matrix[i][j];
      }
    }

  
    System.out.println(upperSum + " " + lowerSum);
  }
}
