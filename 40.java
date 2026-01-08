import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int key=in.nextInt();
        for(int i=0;i<n;i++){ 
        if(arr[i]==key)
        System.out.println(i);
        }
    }
}
output
5
12 34 67 56 89
67
2


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
output
7
12 3 4 5 7 78 16
16 78 7 5 4 3 12 
