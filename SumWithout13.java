import java.util.Scanner;

public class SumWithout13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter three integers (separated by spaces): ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            int result = sumWithout13(a, b, c);
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

    public static int sumWithout13(int a, int b, int c) {
        if (a == 13) {
            return 0;
        } else if (b == 13) {
            return a;
        } else if (c == 13) {
            return a + b;
        } else {
            return a + b + c;
        }
    }
}
