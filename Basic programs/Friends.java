import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Amar's age and height:");
        int aAge = sc.nextInt();
        double aHeight = sc.nextDouble();

        System.out.println("Enter Akbar's age and height:");
        int kAge = sc.nextInt();
        double kHeight = sc.nextDouble();

        System.out.println("Enter Anthony's age and height:");
        int tAge = sc.nextInt();
        double tHeight = sc.nextDouble();

        String youngest = "Amar";
        if (kAge < aAge && kAge <= tAge) {
            youngest = "Akbar";
        } else if (tAge < aAge && tAge < kAge) {
            youngest = "Anthony";
        }

        String tallest = "Amar";
        if (kHeight > aHeight && kHeight >= tHeight) {
            tallest = "Akbar";
        } else if (tHeight > aHeight && tHeight > kHeight) {
            tallest = "Anthony";
        }

        System.out.println("Youngest: " + youngest);
        System.out.println("Tallest: " + tallest);

        sc.close();
    }
}
