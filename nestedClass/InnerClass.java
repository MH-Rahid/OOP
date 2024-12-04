package nestedClass;

class OuterClass {
    private String message = "Hello form outer class ";

    class InnerClass {
        void display() {
            System.out.println(message);
        }

    }

    InnerClass inner = new InnerClass();
}

public class InnerClass {
    public static void main(String[] args) {
        // OuterClass outer = new OuterClass();
        // OuterClass.InnerClass inner = outer.new InnerClass();
        // inner.display();

        // OuterClass.InnerClass in = new OuterClass().new InnerClass();
        // in.display();

        OuterClass outer = new OuterClass();
        outer.inner.display();
    }
}
