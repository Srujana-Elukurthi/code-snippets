// Main.java
class Person {
    // Encapsulation: private variables
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    // Method
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Inheritance: Student is a subclass of Person
class Student extends Person {
    private String course;

    // Constructor for Student
    public Student(String name, int age, String course) {
        super(name, age); // Call the parent constructor
        this.course = course;
    }

    // Method overriding (Polymorphism)
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Course: " + course);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of Person
        Person p1 = new Person("Alice", 30);
        p1.displayInfo();

        // Creating an object of Student
        Student s1 = new Student("Bob", 20, "Computer Science");
        s1.displayInfo();

        // Using setter to change name
        s1.setName("Bobby");
        System.out.println("Updated Name: " + s1.getName());
    }
}
