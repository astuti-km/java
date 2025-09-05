import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter size of an array:");
       int n=sc.nextInt();
       int num[]=new int[n];
       System.out.println("Enter elements of array:");
       for(int i=0;i<n;i++){
           num[i]=sc.nextInt();
       }
       int a=num[0];
       int b=num[0];
       int hcf=num[0];
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               int temp=num[i]*num[j];
               num[i]=num[j];
               num[j]=temp;
           }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            
        }
    }
    System.out.println("HCF of array is:"+hcf);
    for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               a=num[i];
               b=num[j];
           }
       }
       int lcm=num[0];
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               lcm=(a*b)/hcf;
           }
       }
       System.out.println("LCM of array is:"+lcm);
}
}
output
Enter size of an array:
5
Enter elements of array:
56
67
77
44
33
HCF of array is:56
LCM of array is:5093083

import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = in.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Original array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        System.out.println("\nReversed array:");
        for (int i = n-1; i >=0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
output
Enter size of array: 6
Enter 6 elements:
46
13
15
18
25
87
Original array:
46 13 15 18 25 87 
Reversed array:
87 25 18 15 13 46 


import java.util.*;

public class SumArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = in.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("The sum of arrray is:"+sum);
    }}
output
Enter size of array: 5
Enter 5 elements:
14
16
17
18
10
The sum of arrray is:75

import java.util.*;

public class DuplicateInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = in.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Duplicate elements are:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break; 
                }
            }}}}
output
Enter size of array: 5
Enter 5 elements:
13
13
14
17
17
Duplicate elements are:
13
17


