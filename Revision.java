import java.util.*;
class evenOdd{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        if(n%2==0){
            System.out.println(+n+" is even.");
        }
        else {
            System.out.println(+n+" is odd.");
        }
    }
}
output
  68
68 is even.

  import java.util.*;
class largest{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
        if(a>b||a>c){
            System.out.println(+a+" is largest.");
        }
        else if(b>a||b>c){
            System.out.println(+b+" is largest.");
        }
        else if(c>a||c>b){
            System.out.println(+c+" is largest.");
        }
    }} 
output
76
65
54
76 is largest.

  import java.util.*;
class evenOdd{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Array lements are: ");
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }}}
output
  5
Enter 5 elements: 
45
67
67
87
56
Array lements are: 
45 67 67 87 56 

 import java.util.*;
class maxMin{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max)
            max=arr[i];
            if(arr[i]<min)
            min=arr[i];
        }
    
        System.out.println("The max elements is:"+max);
        System.out.println("The min elements is: "+min);
    }}
output
  5
Enter 5 elements: 
1
56
0
45
79
The max elements is:79
The min elements is: 0

  import java.util.*;
class ArraySum{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("The sum of the array is:"+sum);
    }}
output
  5
Enter 5 elements: 
12
24
36
48
56
The sum of the array is:176

  import java.util.*;
class ArraySum{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("The reverse array is: ");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }}
        }
output
  5
Enter 5 elements: 
12
24
3
36
48
The reverse array is: 
48 36 3 24 12 

  


  
