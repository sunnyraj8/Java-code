public class Circle {
    // Constants for a circle
    public static final double PI = 3.14159;
    private final double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        // Using final variable to ensure the radius cannot be changed
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        // Creating circles with different radii

        Circle circle1 = new Circle(5.0);
        System.out.println("Circle 1 - Radius: " + circle1.radius + ", Area: " + circle1.calculateArea());

        Circle circle2 = new Circle(7.5);
        System.out.println("Circle 2 - Radius: " + circle2.radius + ", Area: " + circle2.calculateArea());

        // Attempting to change the radius will result in a compilation error
        // circle1.radius = 10.0; // Uncommenting this line will result in a compilation error
    }
}
