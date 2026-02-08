import java.util.HashSet;
public class Runsubs {
    //print all unique subsequence of string
    public static void UnSubsequence(String str,int idx,String  newStr,HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newStr)){
                return;
            }
            else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char curr=str.charAt(idx);
            //to be
        UnSubsequence(str,idx+1,newStr+curr,set);
            //to not be
            UnSubsequence(str,idx+1,newStr,set);
    }
    public static void main(String args[]){
        HashSet <String> set = new HashSet<>();
        String str="aaa";
        UnSubsequence(str,0,"",set);
    }
}

public class Rkeypad {
    //print keypad combination
    static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static void printComb(String str,int idx,String combn){
        if(idx==str.length()){
            System.out.println(combn);
            return;
        }
        char curr=str.charAt(idx);
        String map=keypad[curr-'0'];

        for(int i=0;i<map.length();i++){
            printComb(str,idx+1,combn+map.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="4";
        printComb(str,0,"");
    }
}

public class RsideLat {
    public static void moveAll(String str,int idx,int cnt,String newString){
        if(idx==str.length()){
            for(int i=0;i<cnt;i++){
                    newString+='x';
            }
                System.out.println(newString);
            return;
        }
        char curr=str.charAt(idx);
        if(curr=='x'){
            cnt++;
            moveAll(str,idx+1,cnt,newString);
        }
        else {
            newString+=curr;
            moveAll(str,idx+1,cnt,newString);
        }
    }
    public static void main(String[] args) {
        String str="xxxpoxklxmt";
        moveAll(str,0,0,"");
    }
}

public class Rduplic {
    static boolean[] map=new boolean[26];

    public static void removeDuplicates(String str,int idx,String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char curr=str.charAt(idx);
        if(map[curr-'a']){
            removeDuplicates(str,idx+1,newStr);
        }
        else {
            newStr+=curr;
            map[curr-'a']=true;
            removeDuplicates(str,idx+1,newStr);
        }
    }
    public static void main(String args[]){
        String str="abbccdda";
        removeDuplicates(str,0,"");
    }
}

public class Rsubs {
    //print all subsequences of a string
    public static void Subsequence(String str,int idx,String  newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char curr=str.charAt(idx);
            //to be
        Subsequence(str,idx+1,newStr+curr);
            //to not be
            Subsequence(str,idx+1,newStr);
    }
    public static void main(String args[]){
        String str="abc";
        Subsequence(str,0,"");
    }
}

public class Rsort {
    public static boolean SortedArr(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return SortedArr(arr,idx+1);}
            else {
                return false;
            }
        }
        public static void main(String[] args) {
            int arr[]={1,2,3,4,5};
            System.out.println(SortedArr(arr,0));
        }
    }

public class Rpwnlogn {
    static int calPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return calPower(x,n/2)*calPower(x,n/2);
        }
        else {
            return calPower(x,n/2)*calPower(x,n/2)*x;
        }
    }
    public static void main(String[] args) {
        int x=9;
        int n=4;
        int ans=calPower(x,n);
        System.out.println(ans);
    }
}

public class Rpower {
    static int calcPw(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int p=calcPw(x,n-1);
        int xTp=x*p;
        return xTp;
    }
    public static void main(String[] args) {
        int x=2;
        int n=5;
        int ans=calcPw(x,n);
        System.out.println(+x+" to the power "+n+" is: "+ans);
    }
}
