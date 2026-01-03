import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = in.nextInt();

        int[] arr = new int[n - 1];
        System.out.println("Enter " + (n - 1) + " numbers:");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = in.nextInt();
        }

       
        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;

        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }

        int missing = totalSum - arrSum;
        System.out.println("Missing number is: " + missing);
    }
}

class Main {
    public static void main(String[] args) {
        String str = "banana";
        String newStr = str.replace('a', 'x');
        System.out.println(newStr);
    }
}

class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        int i=s1.length()-1;
        int j=s2.length()-1;
        int carry=0;
        String result="";
        while(i>=0 ||j>=0){
            int sum=carry;
            if(i>=0)
                sum+=s1.charAt(i--)-'0';
            if(j>=0)
                sum+=s2.charAt(j--)-'0';
            
            result=(sum%2)+result;
            carry=sum/2;
        }
        if(carry==1)
        result="1"+result;
        
        int index=0;
        while(index<result.length()-1 && result.charAt(index)=='0'){
            index++;
        }
      return result.substring(index);
    }
    public static void main(String args[]){
        String s1="1011";
        String s2="11";
        Solution obj=new Solution();
        obj.addBinary(s1,s2);
    }
}
