import java.util.Scanner;

public class RocketLaunchForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown starting number: ");
        int start = sc.nextInt();

        // Countdown using for-loop
        for (int counter = start; counter >= 1; counter--) {
            System.out.println(counter);
        }

        System.out.println("Blast off!");
    }
}
