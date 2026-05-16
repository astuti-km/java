import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        String studentName = "";
        int rollNumber = 0;
        double marks1 = 0;
        double marks2 = 0;
        double marks3 = 0;

        do {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Student Details");
            System.out.println("3. Calculate Total Marks");
            System.out.println("4. Calculate Average");
            System.out.println("5. Find Grade");
            System.out.println("6. Check Pass or Fail");
            System.out.println("7. Update Student Name");
            System.out.println("8. Update Marks");
            System.out.println("9. Display Marksheet");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    studentName = sc.nextLine();

                    System.out.print("Enter Roll Number: ");
                    rollNumber = sc.nextInt();

                    System.out.print("Enter Marks in Subject 1: ");
                    marks1 = sc.nextDouble();

                    System.out.print("Enter Marks in Subject 2: ");
                    marks2 = sc.nextDouble();

                    System.out.print("Enter Marks in Subject 3: ");
                    marks3 = sc.nextDouble();

                    System.out.println("Student Added Successfully!");
                    break;

                case 2:

                    System.out.println("\n----- STUDENT DETAILS -----");
                    System.out.println("Student Name : " + studentName);
                    System.out.println("Roll Number  : " + rollNumber);
                    System.out.println("Subject 1 Marks : " + marks1);
                    System.out.println("Subject 2 Marks : " + marks2);
                    System.out.println("Subject 3 Marks : " + marks3);

                    break;

                case 3:

                    double total = marks1 + marks2 + marks3;

                    System.out.println("Total Marks = " + total);

                    break;

                case 4:

                    double average = (marks1 + marks2 + marks3) / 3;

                    System.out.println("Average Marks = " + average);

                    break;

                case 5:

                    double avg = (marks1 + marks2 + marks3) / 3;

                    if (avg >= 90) {
                        System.out.println("Grade = A");
                    } else if (avg >= 75) {
                        System.out.println("Grade = B");
                    } else if (avg >= 60) {
                        System.out.println("Grade = C");
                    } else if (avg >= 40) {
                        System.out.println("Grade = D");
                    } else {
                        System.out.println("Grade = F");
                    }

                    break;

                case 6:

                    if (marks1 >= 40 && marks2 >= 40 && marks3 >= 40) {
                        System.out.println("Result = PASS");
                    } else {
                        System.out.println("Result = FAIL");
                    }

                    break;

                case 7:

                    sc.nextLine();

                    System.out.print("Enter New Student Name: ");
                    studentName = sc.nextLine();

                    System.out.println("Student Name Updated Successfully!");

                    break;

                case 8:

                    System.out.print("Enter New Marks for Subject 1: ");
                    marks1 = sc.nextDouble();

                    System.out.print("Enter New Marks for Subject 2: ");
                    marks2 = sc.nextDouble();

                    System.out.print("Enter New Marks for Subject 3: ");
                    marks3 = sc.nextDouble();

                    System.out.println("Marks Updated Successfully!");

                    break;

                case 9:

                    double totalMarks = marks1 + marks2 + marks3;
                    double avgMarks = totalMarks / 3;

                    System.out.println("\n========== MARKSHEET ==========");
                    System.out.println("Student Name : " + studentName);
                    System.out.println("Roll Number  : " + rollNumber);

                    System.out.println("--------------------------------");
                    System.out.println("Subject 1 : " + marks1);
                    System.out.println("Subject 2 : " + marks2);
                    System.out.println("Subject 3 : " + marks3);

                    System.out.println("--------------------------------");
                    System.out.println("Total Marks : " + totalMarks);
                    System.out.println("Average     : " + avgMarks);

                    if (avgMarks >= 90) {
                        System.out.println("Grade : A");
                    } else if (avgMarks >= 75) {
                        System.out.println("Grade : B");
                    } else if (avgMarks >= 60) {
                        System.out.println("Grade : C");
                    } else if (avgMarks >= 40) {
                        System.out.println("Grade : D");
                    } else {
                        System.out.println("Grade : F");
                    }

                    if (marks1 >= 40 && marks2 >= 40 && marks3 >= 40) {
                        System.out.println("Result : PASS");
                    } else {
                        System.out.println("Result : FAIL");
                    }

                    System.out.println("================================");

                    break;

                case 10:

                    System.out.println("Exiting Program...");
                    System.out.println("Thank You!");

                    break;

                default:

                    System.out.println("Invalid Choice! Please Try Again.");
            }

        } while (choice != 10);

        sc.close();
    }
}
