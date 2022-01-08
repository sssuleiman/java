import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        double radius = in.nextDouble();
        
        double diameter = 2 * radius;
        System.out.println("Diameter of circle is: " + diameter);
        double circumference = 2 * PI * radius;
        System.out.println("Circumference is : " + circumference);
        double area = PI * radius*radius;
        System.out.println("Area is: " + area);

    }
}
