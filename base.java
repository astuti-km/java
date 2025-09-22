class Main{
    public static void main(String args[]){
        int n=2008;
        if((n%100!=0&&n%4==0)||(n%400==0)){
            System.out.println(+n+" is a leap year.");
        }
        else {
            System.out.println(+n+" is not leap year.");
        }
    }
}
output
2008 is a leap year.

class Main{
    public static void main(String args[]){
        String name="Astuti";
        char c=name.charAt(0);
        c=Character.toLowerCase(c);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            System.out.println("this are in vowel.");
        }
        else {
            System.out.println("This are not in vowels.");
        }
    }
        }
output
this are in vowel.
