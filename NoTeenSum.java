import java.util.Scanner;

public class NoTeenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter three integers (separated by spaces): ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            int result = noTeenSum(a, b, c);
            System.out.println("Sum: " + result);

            // Ask user if they want to continue
            System.out.print("Do you want to continue? (yes/no): ");
            String choice = scanner.next().toLowerCase();

            if (!choice.equals("yes")) {
                break; // Exit the loop if the user does not want to continue
            }
        }

        scanner.close();
    }

    // Helper function to fix teen values
    public static int fixTeen(int n) {
        if ((n >= 13 && n <= 14) || (n >= 17 && n <= 19)) {
            return 0;
        } else {
            return n;
        }
    }

    // Main function to calculate the sum without teens
    public static int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }
}
