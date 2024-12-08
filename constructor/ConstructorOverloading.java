class Rectangle {
    int length;
    int width;

    // Constructor with no parameters (default constructor)
    public Rectangle() {
        length = 0;
        width = 0;
    }

    // Constructor with one parameter
    public Rectangle(int side) {
        length = side;
        width = 0;
    }

    // Constructor with two parameters
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void display() {
        System.out.println("Length: " + length + ", Width: " + width);
    }

}

public class ConstructorOverloading {

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(); // Default constructor
        Rectangle rect2 = new Rectangle(5); // Constructor with one parameter
        Rectangle rect3 = new Rectangle(4, 6); // Constructor with two parameters

        rect1.display();
        rect2.display();
        rect3.display();
    }

}
