import java.util.Scanner;
public class MarksToCGPAConverter {
    public static double calculatePercentage(int[] marks, int subjects) {
        int total = 0;

        for (int i = 0; i < subjects; i++) {
            total += marks[i];
        }

        return (double) total / subjects;
    }
    public static double convertToCGPA(double percentage) {
        return percentage / 9.5; 
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== MARKS TO CGPA CONVERTER =====");

        System.out.print("Enter number of subjects: ");
        int subjects = scanner.nextInt();

        int[] marks = new int[subjects];

        System.out.println("\nEnter marks for each subject (out of 100):");

        for (int i = 0; i < subjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Please enter between 0 and 100.");
                i--;
            }
        }
        double percentage = calculatePercentage(marks, subjects);

        double cgpa = convertToCGPA(percentage);

        System.out.println("\n===== RESULT =====");
        System.out.println("Total Subjects : " + subjects);
        System.out.println("Average Marks  : " + percentage);
        System.out.printf("CGPA           : %.2f\n", cgpa);

        if (cgpa >= 9)
            System.out.println("Grade  : Outstanding");
        else if (cgpa >= 8)
            System.out.println("Grade  : Excellent");
        else if (cgpa >= 7)
            System.out.println("Grade  : Very Good ");
        else if (cgpa >= 6)
            System.out.println("Grade  : Good ");
        else if (cgpa >= 5)
            System.out.println("Grade  : Average");
        else
            System.out.println("Grade : Needs Improvement");
    }
}
