import java.util.*;
import java.io.*;

class Student {
    private int id;
    private String name;
    private int age;
    private double marks;

    public Student(int id, String name, int age, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getMarks() { return marks; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setMarks(double marks) { this.marks = marks; }

    public String toString() {
        return id + "," + name + "," + age + "," + marks;
    }

    public void display() {
        System.out.println("ID: " + id + " Name: " + name + " Age: " + age + " Marks: " + marks);
    }
}

class StudentManager {
    private List<Student> students = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        students.add(new Student(id, name, age, marks));
        System.out.println("Student Added Successfully!");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student s : students) {
            s.display();
        }
    }

    public void searchStudent() {
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.getId() == id) {
                s.display();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void updateStudent() {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Student s : students) {
            if (s.getId() == id) {
                System.out.print("Enter new name: ");
                s.setName(sc.nextLine());

                System.out.print("Enter new age: ");
                s.setAge(sc.nextInt());

                System.out.print("Enter new marks: ");
                s.setMarks(sc.nextDouble());

                System.out.println("Updated successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            if (it.next().getId() == id) {
                it.remove();
                System.out.println("Deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void sortStudents() {
        students.sort(Comparator.comparingDouble(Student::getMarks).reversed());
        System.out.println("Sorted by marks (descending).");
    }

    public void saveToFile() {
        try (PrintWriter pw = new PrintWriter("students.txt")) {
            for (Student s : students) {
                pw.println(s.toString());
            }
            System.out.println("Saved to file.");
        } catch (Exception e) {
            System.out.println("Error saving file.");
        }
    }

    public void loadFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("students.txt"))) {
            students.clear();
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                students.add(new Student(
                        Integer.parseInt(data[0]),
                        data[1],
                        Integer.parseInt(data[2]),
                        Double.parseDouble(data[3])
                ));
            }
            System.out.println("Loaded from file.");
        } catch (Exception e) {
            System.out.println("Error loading file.");
        }
    }

    public void menu() {
        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Sort Students");
            System.out.println("7. Save to File");
            System.out.println("8. Load from File");
            System.out.println("9. Exit");

            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: searchStudent(); break;
                case 4: updateStudent(); break;
                case 5: deleteStudent(); break;
                case 6: sortStudents(); break;
                case 7: saveToFile(); break;
                case 8: loadFromFile(); break;
                case 9: System.exit(0);
                default: System.out.println("Invalid choice.");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        sm.menu();
    }
}