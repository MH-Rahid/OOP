class Student {
    private String name;
    private int roll;
    private int age;

    Student() {
        this.name = "Rahid";
        this.roll = 148;
        this.age = 22;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Age: " + age);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.displayDetails();
    }

}