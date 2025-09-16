import java.util.*;

class PalindromeCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();
    
        str = str.toLowerCase();
        
        int left = 0, right = str.length() - 1;
        boolean isPalindrome = true;
        
        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        
        if(isPalindrome)
            System.out.println("Palindrome String");
        else
            System.out.println("Not a Palindrome String");
    }
}
output
Enter a string: kanak
Palindrome String
