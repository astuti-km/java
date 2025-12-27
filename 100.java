class Solution {
    static  int inversionCount(int arr[]) {
        // Code Here
        return sort(arr,0,arr.length-1);
    }
    static int sort(int[] arr,int l,int r){
        if(l>=r) return 0;
        int mid=(l+r)/2;
        int count=0;
        count+=sort(arr,l,mid);
        count+=sort(arr,mid+1,r);
        count+=merge(arr,l,mid,r);
        return count;
    }
    static int merge(int[] arr,int l,int mid,int r){
        int[] temp=new int[r-l+1];
        int i=l,j=mid+1,k=0,count=0;
        while(i<=mid && j<=r){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }
            else {
                temp[k++]=arr[j++];
                count+=(mid-i+1);
            }
        }
        while(i<=mid) temp[k++]=arr[i++];
        while(j<=r) temp[k++]=arr[j++];
        
        for(i=l,k=0;i<=r;i++,k++)
        arr[i]=temp[k];
        return count;
    }
}

class Solution {
    public ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        // code here
        ArrayList<int[]> res= new ArrayList<>();
        int i=0;
        int n=intervals.length;
        while(i<n && intervals[i][1]<newInterval[0]){
            res.add(intervals[i]);
            i++;
        }
        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        res.add(newInterval);
        while(i<n){
            res.add(intervals[i]);
            i++;
        }
        return res;
    }
}


class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
      int n=arr.length;
      
      Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
      ArrayList<int[]> res=new ArrayList<>();
      int start=arr[0][0];
      int end=arr[0][1];
      for(int i=0;i<n;i++){
          if(arr[i][0]<=end){
                  end=Math.max(end,arr[i][1]);
              }
          else {
          res.add(new int[]{start,end});
          start=arr[i][0];
          end=arr[i][1];
      }
    }
    res.add(new int[]{start,end});
      return res;
    }
}

class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int i=a.length-1,j=0;
        while(i>=0  && j<b.length){
            if(a[i]<=b[j]){
                break;
            }
            
                int temp=a[i];
                a[i]=b[j];
                b[j]=temp;
                i--;
                j++;
            
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
