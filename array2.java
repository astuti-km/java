//Take an array of names as input from the user and print them on the screen.
import java.util.*;
public class array2 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       sc.nextLine(); // consume the newline after the number (learn this)

       String name[] = new String[n];
       System.out.println("Enter " + n + " names: ");
       
       for (int i = 0; i < n; i++) {
           name[i] = sc.nextLine();
       }

       for (int j = 0; j < name.length; j++) {
           System.out.println("Name at index " + j + " is: " + name[j]);
       }
   }
}
output
  5
Enter 5 names: 
Astuti
Jyoti
Niketan
Deepali
Rashi
Name at index 0 is: Astuti
Name at index 1 is: Jyoti
Name at index 2 is: Niketan
Name at index 3 is: Deepali
Name at index 4 is: Rashi

 //Find the maximum & minimum number in an array of integers. 
import java.util.*;
public class array3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements: "); 
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        

      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];}
            if(arr[i]>max){
                max=arr[i];
            }}
            System.out.println("The max number is:"+max);
            System.out.println("The min number is: "+min);
        }}
output
  5
Enter 5 elements: 
12
23
13
14
09
The max number is:23
The min number is: 9

/*Take an array of numbers as input and check if it is an array sorted in ascending order.
Eg : { 1, 2, 4, 7 } is sorted in ascending order.
       {3, 4, 6, 2} is not sorted in ascending order.*/

  import java.util.*;
public class array4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements: "); 
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        boolean isAscen=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isAscen=false;
            }
        }
        if(isAscen){
            System.out.println("Array is presented in sorting order.");
        }
        else{
            System.out.println("Array is not presented in sorting order.");
        }
        }}
output
  5
Enter 5 elements: 
1
2
4
7
9
Array is presented in sorting order.
