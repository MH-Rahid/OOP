class Student {
    private String name;
    private int roll;
    private int age;

    Student(String name, int roll, int age) {
        this.name = name;
        this.roll = roll;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Age: " + age);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Student s1 = new Student("Mehedi", 146, 22);

        s1.displayDetails();

    }
}
