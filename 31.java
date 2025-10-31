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