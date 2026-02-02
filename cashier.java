import java.util.*;
class Cashier{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] d=new int[n];
        int[] coin=new int[n];
        for(int i=0;i<n;i++){
            d[i]=in.nextInt();
        }
        int c=in.nextInt();
        
        for(int i=0;i<n;i++){
            coin[i]=c/d[i];
            c=c%d[i];
            System.out.print(coin[i]+" ");
        }
        System.out.println();
    }
}
output
3
25 10 1
30
1 0 5 
