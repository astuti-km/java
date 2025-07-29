//Check if String with spaces is Empty or Null

class Main {
  public static void main(String[] args) {

    String str = " ";
    System.out.println("str is " + isNullEmpty(str));
  }
  public static String isNullEmpty(String str) {
    if (str == null) {
      return "NULL";
    }
    else if (str.trim().isEmpty()){
      return "EMPTY";
    }

    else {
      return "neither NULL nor EMPTY";
    }
  }
}
output
str is EMPTY

//
public class Decimal {

    public static void main(String[] args) {
        double num = 1.34567;

        System.out.format("%.4f", num);
    }
}
output
1.3457

