import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
           for(int i=0;i<n;i++){
               System.out.print(arr[i]+" ");
           }
    }
}

Algorithm

START
for i to n-1
for j to n-i-1
if arr[j] is greater than arr[j+1]
swap arr[j] and arr[j+1]
END
