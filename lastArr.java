import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        int result[][] = new int[r][c];

        System.out.println("Enter first matrix:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter second matrix:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                b[i][j] = sc.nextInt();

        // Addition
        System.out.println("\nAddition:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = a[i][j] + b[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        // Subtraction
        System.out.println("\nSubtraction:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = a[i][j] - b[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        // Multiplication
        System.out.println("\nMultiplication: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = a[i][j] * b[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        // Division 
        System.out.println("\nDivision: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (b[i][j] != 0)
                    System.out.print((a[i][j] / b[i][j]) + " ");
                else
                    System.out.print("∞ ");
            }
            System.out.println();
        }

        // Transpose of first matrix
        System.out.println("\nTranspose of first matrix: ");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}
output
Enter rows and columns: 3
3
Enter first matrix:
1 2 3 
4 5 6
7 6 5
Enter second matrix:
5 7 0 
3 6 5 
3 8 9

Addition:
6 9 3 
7 11 11 
10 14 14 

Subtraction:
-4 -5 3 
1 -1 1 
4 -2 -4 

Multiplication: 
5 14 0 
12 30 30 
21 48 45 

Division: 
0 0 ? 
1 0 1 
2 0 0 

Transpose of first matrix: 
1 4 7 
2 5 6 
3 6 5 
