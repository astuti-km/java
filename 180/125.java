import java.util.*;
class Strings{
  static boolean isAnagrams(String s1,String s2){
      if(s1.length()!=s2.length())
          return false;
      
      char[] s1Arr=s1.toCharArray();
      char[] s2Arr=s2.toCharArray();
      
      Arrays.sort(s1Arr);
      Arrays.sort(s2Arr);
      return Arrays.equals(s1Arr,s2Arr);
  }  
  public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      String s1=in.next();
      String s2=in.next();
      
      if(isAnagrams(s1,s2)==true){
          System.out.println("true");
      }
      else {
          System.out.println("false");
      }
  }
}
astuti
sutita
true


import java.util.*;
class Sort{
    static int[] bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int[] srt=bubbleSort(arr);
        System.out.println(Arrays.toString(srt));
    }
}
5
7 8 3 1 2
[1, 2, 3, 7, 8]


import java.util.*;
class Sort{
    static int[] bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int small=i;
            for(int j=i+1;j<n;j++){
                if(arr[small]>arr[j]){
                    small=j;
                }
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int[] srt=bubbleSort(arr);
        System.out.println(Arrays.toString(srt));
    }
}
5
6 8 0 5 2
[0, 2, 5, 6, 8]



import java.util.*;
class Sort{
    static int[] bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int[] srt=bubbleSort(arr);
        System.out.println(Arrays.toString(srt));
    }
}
5
6 8 5 7 4 
[4, 5, 6, 7, 8]
