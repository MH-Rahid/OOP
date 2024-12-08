class Student {
    private String name;
    private int rollNo;
    private int age;

    // Constructor to initialize a new Student object
    public Student(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    // Copy Constructor (creates a new Student with the same values as the given
    // Student)
    public Student(Student other) {
        this.name = other.name;
        this.rollNo = other.rollNo;
        this.age = other.age;
    }

    // Method to display details of the Student
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Age: " + age);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        // Creating the first Student object
        Student student1 = new Student("John Doe", 101, 20);
        System.out.println("Original Student:");
        student1.displayDetails();

        // Using the copy constructor to create a copy of student1
        Student student2 = new Student(student1);

        System.out.println("\nCopied Student (using copy constructor):");
        student2.displayDetails();
    }
}
