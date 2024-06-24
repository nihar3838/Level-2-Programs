import java.util.Scanner;
class Rectangle {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double calculateArea() {
        return length * breadth;
    }
}

class Triangle {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double calculateArea() {
        return 0.5 * base * height;
    }
}
public class Areareturningobjects {
    public static Rectangle createRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();
        return new Rectangle(length, breadth);
    }

    public static Triangle createTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        return new Triangle(base, height);
    }

    public static void main(String[] args) {
        Rectangle rectangle = createRectangle();
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());

        Triangle triangle = createTriangle();
        System.out.println("Area of the triangle:" + triangle.calculateArea());
    }
}





