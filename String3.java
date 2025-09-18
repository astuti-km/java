public class StringExample {
    public static void main(String[] args) {
      
        String name = "Astuti Kumari";
        System.out.println("Original String: " + name);

        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());

    System.out.println("Substring (0 to 6): " + name.substring(0, 6));

        System.out.println("Character at index 3: " + name.charAt(3));

        System.out.println("Contains 'Kumari'? " + name.contains("Kumari"));
    }
}
output
Original String: Astuti Kumari
Length: 13
Uppercase: ASTUTI KUMARI
Lowercase: astuti kumari
Substring (0 to 6): Astuti
Character at index 3: u
Contains 'Kumari'? true

public class ReverseString {
    public static void main(String[] args) {
        String str = "Astuti";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Reversed String: " + rev);
    }
}
output
Reversed String: itutsA


public class VowelsConsonants {
    public static void main(String[] args) {
        String str = "Astuti Kumari";
        str = str.toLowerCase();
        int vowels = 0, consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
output
Vowels: 6
Consonants: 6
