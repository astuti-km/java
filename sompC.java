
class Solution {
    public static String sliceString(String s) {
        String rev="";
        for(int i=1;i<=s.length()-2;i++){
            rev+=s.charAt(i);
        }
        return rev;
    }
}

class Solution {
    public static void changeCase(String s) {
        String first =s.substring(0,1).toUpperCase()+s.substring(1);
        String sec=s.toUpperCase();
        
        System.out.println(first);
        System.out.println(sec);
    }
}

class Solution {
    public static String reverseString(String s) {
    String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        return rev;
    }
}

class Solution {
    public static int lengthString(String str) {

       return str.length();
        
    }
}

// User function Template for Java

class Solution {
    // Complete the function
    // str: input string
    public static int countWords(String str) {
        // find and return the number of words
        // present in the string
        if(str==null || str.trim().isEmpty())
        return 0;
        String[] words =str.trim().split("\\s+");
        return words.length;
    }
}

class Solution {
    public static int[] decrementArrayElements(int[] arr) {
        // Code here
        for(int i=0;i<arr.length;i++){
            arr[i]-=1;
        }
      return arr;
    }
}
class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
               return false;
            }}
                
                return true;
            
        
    }
}

class Solution {
    public static int largest(int[] arr) {
        // code here
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
            }
            return max;
        
    }
}

import java.util.*;
class Solution {
    public static int arraySum(int[] arr) {
        // code here
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = in.nextInt();  
        
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();  
        }
        System.out.println(arraySum(arr));
    }
}
import java.util.*;
class Solution {
    void helloFunction(){
        System.out.println("Hello");
    }
    public static void main(String args[]){ 
    Solution obj=new Solution();
    obj.helloFunction();
    }
}

class Solution {
    public static double posAverage(int[] arr) {
        // Code here
        int sum=0,count =0;
        for(int v:arr){
            if(v>0){
                sum+=v;
                count++;
            }
        }
        if(count==0) return 0;
        return (double) sum/count;
    }}
    
