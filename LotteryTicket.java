import java.util.Scanner;

public class LotteryTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Continue until the user chooses to quit
        while (true) {
            System.out.print("Enter three integers (separated by spaces): ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            int result = lotteryTicket(a, b, c);
            System.out.println("Result: " + result);

            // Ask user if they want to continue
            System.out.print("Do you want to continue? (yes/no): ");
            String choice = scanner.next().toLowerCase();

            if (!choice.equals("yes")) {
                break; // Exit the loop if the user does not want to continue
            }
        }

        scanner.close();
    }

    // Main function to calculate result based on lottery ticket rules
    public static int lotteryTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20; // All numbers are the same
        } else if (a == b || b == c || a == c) {
            return 10; // Two numbers are the same
        } else {
            return 0; // All numbers are different
        }
    }
}
