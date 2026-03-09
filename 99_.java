import java.util.Scanner;

class InvalidMobileException extends Exception {
    InvalidMobileException(String msg) {
        super(msg);
    }
}

public class MobileValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile number: ");
        String num = sc.nextLine();

        try {
            if (num.length() != 10) {
                throw new InvalidMobileException("Mobile number must be 10 digits");
            }

            for (int i = 0; i < num.length(); i++) {
                if (!Character.isDigit(num.charAt(i))) {
                    throw new InvalidMobileException("Only numeric digits allowed");
                }
            }

            System.out.println("Valid mobile number");
        }

        catch (InvalidMobileException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

public class UserDefinedDemo {
    public static void main(String[] args) {
        try {
            throw new MyException("This is user defined exception");
        }

        catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class BuiltInExceptionDemo {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        }

        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }

        try {
            int arr[] = new int[3];
            arr[5] = 10;
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        }
    }
}

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;

            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);
        }

        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Cannot divide by zero");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception");
        }

        catch (Exception e) {
            System.out.println("General Exception");
        }
    }
}
