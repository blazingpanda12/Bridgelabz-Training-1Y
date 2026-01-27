import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        long fact = 1;
        int i = 1;

        while (i <= n) {
            fact = fact * i;
            i++;
        }

        System.out.println(n + "! = " + fact);
    }
}
