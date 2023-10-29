class MyClass {
    static int count = 0; // Static variable

    public MyClass() {
        count++; // Increment the static variable in the constructor
    }
}

public class StaticVariableExample {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();

        // Access the static variable using the class name
        System.out.println("Total instances created: " + MyClass.count);

        // Each object can access the same static variable
        System.out.println("obj1's count: " + obj1.count);
        System.out.println("obj2's count: " + obj2.count);
        System.out.println("obj3's count: " + obj3.count);
    }
}
