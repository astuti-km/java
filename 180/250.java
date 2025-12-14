 import java.util.Scanner;
public class soln{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
               if ((i+j)%2==0){
                System.out.print("1");
               }
               else {
                System.out.print("0");
               }
    }
    System.out.println();
}
    }
}


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


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        System.out.println(list.contains(20));

        list.add(50);
        list.add(60);

        for (int x : list) {
            System.out.println(x);
        }
    }
}



public class Prime {

    public static void main(String[] args) {

        int low = 20, high = 50;

        while (low < high) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {
                // condition for nonprime number
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");

            ++low;
        }
    }
}




public class InsertionSort {
    static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }}
    static void printedArray(int[] arr,int n){
       // System.out.println("Printed array: ");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
     int arr[] = {64, 34, 25, 12, 22, 11, 90};
     int n=arr.length;
        System.out.println("Printed array: ");
        printedArray(arr,n);
        insertionSort(arr,n);
        System.out.println("Sorted array: ");
        printedArray(arr,n);
    }
}


public class PalindromeString {
    public static void main(String[] args) {
        String s = "level";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--)
            rev += s.charAt(i);
        if (s.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}



import java.util.*;
public class sumOfDigit {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        while(n>0){
            int p=n%10;
            sum+=p;
            n/=10;
        }
            System.out.println("The sum of digit is: "+sum);
        }
    }



import java.util.*;
public class StudentMarksManager{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        if(n <= 0){
            System.out.println("Invalid number of students!");
            return;
        }
        String[] names = new String[n];
        int[] marks = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.next();
            System.out.print("Enter marks of " + names[i] + ": ");
            marks[i] = sc.nextInt();
            if(marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks, setting to 0.");
                marks[i] = 0;
            }
        }
        while(true){
            System.out.println("\n--- Student Marks Menu ---");
            System.out.println("1. Display all students");
            System.out.println("2. Display students with marks > 50");
            System.out.println("3. Search for a student by name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("All Students:");
                    for(int i = 0; i < n; i++){
                        System.out.println(names[i] + " - " + marks[i]);
                    }
                    break;
                case 2:
                    System.out.println("Students with marks > 50:");
                    for(int i = 0; i < n; i++){
                        if (marks[i] <= 50) continue;
                        System.out.println(names[i] + " - " + marks[i]);
                    }
                    break;
                case 3:
                    System.out.print("Enter student name to search: ");
                    String searchName = sc.next();
                    boolean found = false;
                    for(int i = 0; i < n; i++){
                        if(names[i].equalsIgnoreCase(searchName)) {
                            System.out.println("Found: " + names[i] + " - " + marks[i]);
                            found = true;
                            break;
                        }
                    }
                    if(!found)
                    System.out.println("Student not found!");
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    return; 
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
