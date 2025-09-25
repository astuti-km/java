public class StringFunctionsExample {
   public static void main(String[] args) {
       // Create a string
       String str = "Hello,Astuti world!";
       // 1. Get the length of the string
       System.out.println("Length: " + str.length());
       // 2. Convert to uppercase
       System.out.println("Uppercase: " + str.toUpperCase());
       // 3. Extract a substring
       System.out.println("Substring (7-11): " + str.substring(7, 11));
       // 4. Replace characters
       System.out.println("Replace 'Astuti' with 'Programming': " + str.replace("Astuti", "Programming"));
       // 5. Check if it contains a word
       System.out.println("Contains 'World': " + str.contains("World"));
       // 6. Split the string into words
       String[] words = str.split(" ");
       System.out.println("Words:");
       for (String word : words) {
           System.out.println(word);
       }
   }
}
output
Length: 19
Uppercase: HELLO,ASTUTI WORLD!
Substring (7-11): stut
Replace 'Astuti' with 'Programming': Hello,Programming world!
Contains 'World': false
Words:
Hello,Astuti
world!
