import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int[][] matrix=new int[m][n];
       System.out.println("Elnter row: "+m+" columns: "+n+":");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");}
                System.out.println();}
    }
}
output
3
4
Elnter row: 3 columns: 4:
1 2 3 4 5 6 7 8 9  13 15 
1 2 3 4 
5 6 7 8 
9 13 15 


import java.util.*;
 public class TwoDArray{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int[][] matrix=new int[m][n];
       System.out.println("Enter row: "+m+" columns: "+n+":");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    System.out.println("Enter the elements to be found: ");
     int num=in.nextInt();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               if (matrix[i][j]==num){
                   System.out.print("Elements "+num+ " found at position ("+i+","+j+")");}}}
               }
    }
output
3
4
Enter row: 3 columns: 4:
1 2 3 4 5 6 7 8 9 0 11 12
1 2 3 4 
5 6 7 8
9 0 11 12
Enter the elements to be found:
11
Elements 11 found at position (2,2)

import java.util.*;
public class arrTranpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][]matrix=new int[m][n];
        System.out.println("Enter row and column matrix: "+m+","+n);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
            matrix[i][j]=sc.nextInt();}}
            for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
            System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The transpose matrix is: ");
    for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }}
output
  3
3
Enter row and column matrix: 3,3
1 2 3 4 5 6 7 8 9 
1 2 3 
4 5 6
7 8 9
The transpose matrix is:
1 4 7
2 5 8
3 6 9
  
