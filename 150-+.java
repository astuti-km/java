public class RpermStr {
    public static void printPerm(String str,String perm){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
             String newStr=str.substring(0,i)+str.substring(i+1);
             printPerm(newStr,perm+currChar);   
        }
    }
    public static void main(String args[]){
        String str="abc";
        printPerm(str,"");
    }
}
output
abc
acb
bac
bca
cab
cba

public class RpathMat {
    public static int countPath(int i,int j,int n,int m){
        if(i==n||j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        int downpath=countPath(i+1,j,n,m);
        int rightpath=countPath(i,j+1,n,m);
        return downpath+rightpath;
    }
    public static void main(String args[]){
        int n=3,m=3;
        int totalPath=countPath(0,0,n,m);
        System.out.println(totalPath);
    }
}
output
6

public class RTiles {
    public static int placeTiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int ver=placeTiles(n-m,m);
        int hori=placeTiles(n-1,m);
        return ver+hori;
    }
    public static void main(String args[]){
        int n=4,m=2;
        int total=placeTiles(n,m);
        System.out.println(total);
            
    }
}
output
5


public class RinvPerson {
    public static int GuestCall(int n){
        if(n<=1){
            return 1;
        }
        int single=GuestCall(n-1);
        int pair=(n-1)*GuestCall(n-2);
        return single+pair;
    }
    public static void main(String args[]){
        int n=4;
        int ans=GuestCall(n);
        System.out.println(ans);
    }
}
output 
10

import java.util.*;
public class Rsubset {
    public static void printSubset(ArrayList<Integer> subset) {
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubset(int n, ArrayList<Integer> subset){
        if(n==0){
            printSubset(subset);
            return;
        }
        //Add
        subset.add(n);
        findSubset(n-1,subset);

        //Not add
        subset.remove(subset.size()-1);
        findSubset(n-1, subset);
    }
    public static void main(String args[]){
        int n=3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);
    }
}
output
3 2 1 
3 2
3 1
3
2 1
2
1
____empty



public class Rbacktrac {
    public static void printPerm(String str,int idx, String perm){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currchar=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            printPerm(newStr,idx+1,perm+currchar);
        }
    }
        public static void main(String args[]){
            String str="ABC";
            printPerm(str,0,"");
        }
    }
output
ABC
ACB
BAC
BCA
CAB
CBA


