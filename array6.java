import java.util.*;
public class matrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
      	int row = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();

        int[][] arr= new int[row][col];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
         System.out.println("Elements of array are: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+ " ");
            }

            System.out.println();
        }
    }
}
output
Enter number of rows: 3
Enter number of columns: 3
Enter elements of array: 
3
5
7
9
7
11
5
4
8
Elements of array are: 
3 5 7 
9 7 11 
5 4 8 

  import java.io.*;
import java.util.Scanner;

class matrices {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] arr = new int[n][];
        int t = 0;
        for (int i = 0; i < n; i++) {
            int m = s.nextInt();
            t = m;
            arr[i] = new int[m];
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int odd = 0, even = 0;
        System.out.println("Rows " + n + " with " + t
                           + " Columns");
        System.out.println("Elements of Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

                if (arr[i][j] % 2 == 0) {
                    even++;
                }
                else {
                    odd++;
                }
            }
            System.out.println();
        }
        System.out.println("Even: " + even
                           + ", Odd: " + odd);
                           s.close();
    }}}
