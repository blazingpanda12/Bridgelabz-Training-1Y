import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of circle:");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.printf("Area of Circle is: %.2f", area);

        sc.close();
    }
}
