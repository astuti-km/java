import java.util.*;
public class StudentMarksManager{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        if(n <= 0){
            System.out.println("Invalid number of students!");
            return;
        }
        String[] names = new String[n];
        int[] marks = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.next();
            System.out.print("Enter marks of " + names[i] + ": ");
            marks[i] = sc.nextInt();
            if(marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks, setting to 0.");
                marks[i] = 0;
            }
        }
        while(true){
            System.out.println("\n--- Student Marks Menu ---");
            System.out.println("1. Display all students");
            System.out.println("2. Display students with marks > 50");
            System.out.println("3. Search for a student by name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("All Students:");
                    for(int i = 0; i < n; i++){
                        System.out.println(names[i] + " - " + marks[i]);
                    }
                    break;
                case 2:
                    System.out.println("Students with marks > 50:");
                    for(int i = 0; i < n; i++){
                        if (marks[i] <= 50) continue;
                        System.out.println(names[i] + " - " + marks[i]);
                    }
                    break;
                case 3:
                    System.out.print("Enter student name to search: ");
                    String searchName = sc.next();
                    boolean found = false;
                    for(int i = 0; i < n; i++){
                        if(names[i].equalsIgnoreCase(searchName)) {
                            System.out.println("Found: " + names[i] + " - " + marks[i]);
                            found = true;
                            break;
                        }
                    }
                    if(!found)
                    System.out.println("Student not found!");
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    return; 
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
output 
Enter number of students: 3
Enter name of student 1: Jyoti
Enter marks of Jyoti: 93
Enter name of student 2: Astuti
Enter marks of Astuti: 91
Enter name of student 3: Avnik
Enter marks of Avnik: 55

--- Student Marks Menu ---
1. Display all students
2. Display students with marks > 50
3. Search for a student by name
4. Exit
Enter your choice: 3
Enter student name to search: Avnik
Found: Avnik - 55

--- Student Marks Menu ---
1. Display all students
2. Display students with marks > 50
3. Search for a student by name
4. Exit
Enter your choice: 4
Exiting program...