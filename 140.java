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
