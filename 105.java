
public class Rmerge {
    public static void merge(int [] arr,int l,int mid,int r){
        
        int i=l;
        int j=mid+1,k=0;
        int merged[]=new int [100];
        while(i<=mid &&j<=r){
            if(arr[i]<arr[j]){
                merged[k++]=arr[i++];
            }
            else {
                merged[k++]=arr[j++];
            }
        }
        while(i<=mid){
             merged[k++]=arr[i++];
        }
        while(j<=r){
            merged[k++]=arr[j++];
        }
        for( i=l,k=0;i<=r;i++,k++)
            arr[i]=merged[k];
        
    }
    public static void mergeSort(int [] arr,int l,int r){
        if(l<r){
            
        
        int mid=l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }}
    public static void main(String[] args) {
        int[] arr={6,3,9,5,2,8};
        int n=arr.length;
        mergeSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
output
2 3 5 6 8 9 


public class Rsusoko {
     public boolean isSafe(char[][] board,int row,int col,int num){
        for(int i=0;i<board.length;i++){
            
            if(board[i][col]==(char)(num+'0')){
                return false;
            }
            if(board[row][i]==(char)(num+'0')){
                return false;
            }
        }
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<=sr+3;i++){
            for(int j=sc;j<=sc+3;i++){
                if(board[i][j]==(char)(num+'0')){
                    return false;
                }
            }
        }
        return true;
     }
    public boolean helper(char[][] board,int row,int col){
        if(row==board.length){
            return true;
        }

        int nrow=0;
        int ncol=0;
        if(col!=board.length-1){
            nrow=row;
            ncol=col+1;
        }
        else {
            nrow=row+1;
            ncol=0;
        }
        if(board[row][col] != '.') {
            if(helper(board,nrow,ncol)){
                return true;
            }}
            else {
                for(int i=0;i<=9;i++){
                    if(isSafe(board,row,col,i)){
                        board[row][col]=(char)(i+'0');
                        if(helper(board,nrow,ncol)){
                            return true;
                        }
                        else {
                            board[row][col]='.';
                        }
                    }
                }
            }
            return false;
        }
    }

