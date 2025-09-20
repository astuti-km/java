public class preDec {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        //post increment
        b=a++;
        System.out.println(a);//a=11
        System.out.println(b);//b=10 
        //post decrement
        b=a--;
        System.out.println(a);//a=10
        System.out.println(b);//b=11

        //pre increment
        a=15;
        b=0;
        b=++a;
        System.out.println(b);//b=16
        System.out.println(a);//a==16
        //pre decrement
        b=--a;
        System.out.println(a);//a=15
        System.out.println(b);//b=15
    }
}
output
11
10
10
11
16
16
15
15

