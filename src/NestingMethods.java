import java.util.Scanner;

class Cuboid {
    double length, breadth, height;

    Cuboid(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    double perimeter() {
        // Perimeter of the base rectangle
        return 2 * (length + breadth);
    }

    double area() {
        // Area of the base rectangle
        double basePerimeter = perimeter();
        System.out.println("Perimeter of the base rectangle: " + basePerimeter);
        return length * breadth;
    }

    double volume() {
        // Volume of the cuboid
        double baseArea = area();
        System.out.println("Area of the base rectangle: " + baseArea);
        return length * breadth * height;
    }
}
//or public class CuboidCalculator {
public class NestingMethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of the cuboid: ");
        double length = scanner.nextDouble();

        System.out.print("Enter breadth of the cuboid: ");
        double breadth = scanner.nextDouble();

        System.out.print("Enter height of the cuboid: ");
        double height = scanner.nextDouble();

        Cuboid cuboid = new Cuboid(length, breadth, height);
        double cuboidVolume = cuboid.volume();

        System.out.println("Volume of the cuboid: " + cuboidVolume);
    }
}
