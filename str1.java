import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        char ch=s.charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println(ch+ " is vowel.");
        }
        else {
            System.out.println(ch+ " is consonant.");
        }
    }
}
output 
v
v is consonant

import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int vowelCount = 0;
        s = s.toLowerCase(); 
        for (int i = 0; i < s.length(); i++) {
    char ch = s.charAt(i); 
if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("The number of vowels is: " + vowelCount);
    }
}
output
Hello java 
The number of vowels is: 4
