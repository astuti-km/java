import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int num1[][]=new int[m][n];
        System.out.println("Enter "+m+" and "+n+" elements: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                num1[i][j]=in.nextInt();}}
        int num2[][]=new int[m][n];
       System.out.println("Enter "+m+" and "+n+" elements: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                num2[i][j]=in.nextInt();}}
                int result[][]=new int[m][n];
                for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
           result[i][j]= num1[i][j]+num2[i][j];}}
                 System.out.println("The sum of 2D array is: ");
                for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        System.out.print(result[i][j]+" ");
                    }
                    System.out.println();
                }
    }}
output
3
3
Enter 3 and 3 elements: 
1 2 3 
5 6 7 
8 9 1
Enter 3 and 3 elements: 
2 3 4 
1 2 3 
3 5 7
The sum of 2D array is: 
3 5 7 
6 8 10 
11 14 8 

