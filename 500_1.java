import java.util.*;

public class StringArrayUtility {

    // Function 1: Count vowels and consonants in a string
    public static void countVowelsConsonants(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // Function 2: Reverse a string
    public static void reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--)
            reversed += str.charAt(i);
        System.out.println("Reversed: " + reversed);
    }

    // Function 3: Check palindrome
    public static void checkPalindrome(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(rev))
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is not a palindrome");
    }

    // Function 4: Sort array of names
    public static void sortNames(String[] names) {
        Arrays.sort(names);
        System.out.println("Sorted Names:");
        for (String n : names)
            System.out.println(n);
    }

    // Function 5: Search for a name in array
    public static void searchName(String[] names, String target) {
        boolean found = false;
        for (String name : names) {
            if (name.equalsIgnoreCase(target)) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println(target + " found!");
        else
            System.out.println(target + " not found!");
    }

    // Function 6: Remove spaces
    public static void removeSpaces(String str) {
        String result = str.replaceAll(" ", "");
        System.out.println("Without spaces: " + result);
    }

    // Main method to test all functions
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        countVowelsConsonants(input);
        reverseString(input);
        checkPalindrome(input);
        removeSpaces(input);

        System.out.println("\nEnter number of names:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        sortNames(names);

        System.out.println("Enter name to search:");
        String target = sc.nextLine();
        searchName(names, target);

        sc.close();
    }
}
Enter a string:
astut
Vowels: 2
Consonants: 3
Reversed: tutsa
astut is not a palindrome
Without spaces: astut

Enter number of names:
5
Enter name 1: astu
Enter name 2: dfhj
Enter name 3: bcjdf
Enter name 4: giefbf
Enter name 5: ffdjshgfd
Sorted Names:
astu
bcjdf
dfhj
ffdjshgfd
giefbf
Enter name to search:
dfhj
dfhj found!


import java.util.*;

public class StringArrayUtilityPro {

    static Scanner sc = new Scanner(System.in);

    // Function 1: Count vowels and consonants
    public static void countVowelsConsonants() {
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();
        int vowels = 0, consonants = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // Function 2: Reverse a string
    public static void reverseString() {
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed: " + rev);
    }

    // Function 3: Check palindrome
    public static void palindromeCheck() {
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String rev = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(rev))
            System.out.println("Palindrome!");
        else
            System.out.println("Not palindrome!");
    }

    // Function 4: Word count
    public static void wordCount() {
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine().trim();
        String[] words = s.split("\\s+");
        System.out.println("Total words: " + words.length);
    }

    // Function 5: Character frequency
    public static void charFrequency() {
        System.out.print("Enter a string: ");
        String s = sc.nextLine().toLowerCase();
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z')
                freq[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0)
                System.out.println((char) (i + 'a') + ": " + freq[i]);
        }
    }

    // Function 6: Remove spaces
    public static void removeSpaces() {
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("Without spaces: " + s.replaceAll(" ", ""));
    }

    // Function 7: Count digits and letters
    public static void countDigitsLetters() {
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        int digits = 0, letters = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) digits++;
            else if (Character.isLetter(c)) letters++;
        }
        System.out.println("Digits: " + digits);
        System.out.println("Letters: " + letters);
    }

    // Function 8: Compare two strings
    public static void compareStrings() {
        System.out.print("Enter first string: ");
        String a = sc.nextLine();
        System.out.print("Enter second string: ");
        String b = sc.nextLine();
        if (a.equalsIgnoreCase(b))
            System.out.println("Strings are equal (ignore case)");
        else
            System.out.println("Strings are different");
    }

    // Function 9: Find duplicates in string array
    public static void findDuplicateStrings() {
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Word " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }
        System.out.println("Duplicate words:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].equalsIgnoreCase(arr[j])) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }

    // Function 10: Sort string array
    public static void sortStringArray() {
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }
        Arrays.sort(arr);
        System.out.println("Sorted names:");
        for (String s : arr)
            System.out.println(s);
    }

    // Function 11: Merge two arrays
    public static void mergeArrays() {
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        sc.nextLine();
        String[] a1 = new String[n1];
        for (int i = 0; i < n1; i++) {
            System.out.print("A1[" + i + "]: ");
            a1[i] = sc.nextLine();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        sc.nextLine();
        String[] a2 = new String[n2];
        for (int i = 0; i < n2; i++) {
            System.out.print("A2[" + i + "]: ");
            a2[i] = sc.nextLine();
        }

        String[] merged = new String[n1 + n2];
        int idx = 0;
        for (String s : a1) merged[idx++] = s;
        for (String s : a2) merged[idx++] = s;

        System.out.println("Merged Array:");
        for (String s : merged)
            System.out.println(s);
    }

    // Function 12: Search element in array
    public static void searchArray() {
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }
        System.out.print("Enter value to search: ");
        String target = sc.nextLine();
        boolean found = false;
        for (String s : arr) {
            if (s.equalsIgnoreCase(target)) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println(target + " found!");
        else
            System.out.println(target + " not found!");
    }

    // Function 13: Remove duplicates
    public static void removeDuplicateStrings() {
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine();
        Set<String> set = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Word " + (i + 1) + ": ");
            set.add(sc.nextLine());
        }
        System.out.println("After removing duplicates:");
        for (String s : set)
            System.out.println(s);
    }

    // Function 14: Find longest word
    public static void longestWord() {
        System.out.print("Enter sentence: ");
        String line = sc.nextLine();
        String[] words = line.split("\\s+");
        String longest = "";
        for (String w : words) {
            if (w.length() > longest.length())
                longest = w;
        }
        System.out.println("Longest word: " + longest);
    }

    // Function 15: Replace vowels with '*'
    public static void replaceVowels() {
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("After replace: " + s.replaceAll("[AEIOUaeiou]", "*"));
    }

    // Function 16: Count uppercase & lowercase
    public static void countCase() {
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        int upper = 0, lower = 0;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) upper++;
            else if (Character.isLowerCase(c)) lower++;
        }
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
    }

    // Function 17: Reverse each word
    public static void reverseEachWord() {
        System.out.print("Enter sentence: ");
        String line = sc.nextLine();
        String[] words = line.split(" ");
        for (String w : words)
            System.out.print(new StringBuilder(w).reverse() + " ");
        System.out.println();
    }

    // Function 18: Check anagram
    public static void checkAnagram() {
        System.out.print("Enter first word: ");
        String a = sc.nextLine().toLowerCase();
        System.out.print("Enter second word: ");
        String b = sc.nextLine().toLowerCase();
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2))
            System.out.println("Anagram!");
        else
            System.out.println("Not anagram!");
    }

    // Function 19: Split string into characters
    public static void splitChars() {
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        for (char c : s.toCharArray())
            System.out.println(c);
    }

    // Function 20: Convert string to char array
    public static void stringToCharArray() {
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        System.out.println("Characters:");
        for (char c : arr)
            System.out.print(c + " ");
        System.out.println();
    }

    // Function 21: Find 2nd largest string length
    public static void secondLargestLength() {
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Word " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }
        Arrays.sort(arr, (x, y) -> y.length() - x.length());
        if (n > 1)
            System.out.println("2nd largest: " + arr[1]);
        else
            System.out.println("Not enough words!");
    }

    // Function 22: Remove vowels
    public static void removeVowels() {
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("Without vowels: " + s.replaceAll("[AEIOUaeiou]", ""));
    }

    // Function 23: Count spaces
    public static void countSpaces() {
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        long spaces = s.chars().filter(ch -> ch == ' ').count();
        System.out.println("Spaces: " + spaces);
    }

    // Function 24: Join two strings
    public static void joinStrings() {
        System.out.print("Enter first string: ");
        String a = sc.nextLine();
        System.out.print("Enter second string: ");
        String b = sc.nextLine();
        System.out.println("Joined: " + a + b);
    }

    // Function 25: Print substring
    public static void substringDemo() {
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        sc.nextLine();
        System.out.println("Substring: " + s.substring(start, end));
    }

    // Main Menu
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n==== STRING & ARRAY UTILITY MENU ====");
            System.out.println("1. Count vowels/consonants");
            System.out.println("2. Reverse string");
            System.out.println("3. Palindrome check");
            System.out.println("4. Word count");
            System.out.println("5. Character frequency");
            System.out.println("6. Remove spaces");
            System.out.println("7. Count digits & letters");
            System.out.println("8. Compare two strings");
            System.out.println("9. Find duplicate words");
            System.out.println("10. Sort string array");
            System.out.println("11. Merge arrays");
            System.out.println("12. Search element");
            System.out.println("13. Remove duplicate strings");
            System.out.println("14. Find longest word");
            System.out.println("15. Replace vowels");
            System.out.println("16. Count uppercase/lowercase");
            System.out.println("17. Reverse each word");
            System.out.println("18. Check anagram");
            System.out.println("19. Split characters");
            System.out.println("20. Convert to char array");
            System.out.println("21. 2nd largest by length");
            System.out.println("22. Remove vowels");
            System.out.println("23. Count spaces");
            System.out.println("24. Join strings");
            System.out.println("25. Substring demo");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> countVowelsConsonants();
                case 2 -> reverseString();
                case 3 -> palindromeCheck();
                case 4 -> wordCount();
                case 5 -> charFrequency();
                case 6 -> removeSpaces();
                case 7 -> countDigitsLetters();
                case 8 -> compareStrings();
                case 9 -> findDuplicateStrings();
                case 10 -> sortStringArray();
                case 11 -> mergeArrays();
                case 12 -> searchArray();
                case 13 -> removeDuplicateStrings();
                case 14 -> longestWord();
                case 15 -> replaceVowels();
                case 16 -> countCase();
                case 17 -> reverseEachWord();
                case 18 -> checkAnagram();
                case 19 -> splitChars();
                case 20 -> stringToCharArray();
                case 21 -> secondLargestLength();
                case 22 -> removeVowels();
                case 23 -> countSpaces();
                case 24 -> joinStrings();
                case 25 -> substringDemo();
                case 0 -> {
                    System.out.println("Exiting program...");
                    return;
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
