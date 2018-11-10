import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your side1: ");
        double side1 = input.nextDouble();
        System.out.println("Enter your side2: ");
        double side2 = input.nextDouble();
        System.out.println("Enter your side3: ");
        double side3 = input.nextDouble();
        System.out.println("Enter your color: ");
        String color = input.next();

        Triangle triangle = new Triangle(side1,side2,side3,color);
        System.out.println(triangle);

    }
}
