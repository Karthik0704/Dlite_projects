import java.util.Scanner;

class password {

    public static boolean verifyPassword(String input) {
        if(input.toCharArray().length < 8){
            return false;
        }
        String lowercaseRegex = ".*[a-z].*";
        String uppercaseRegex = ".*[A-Z].*";
        String specialCharRegex = ".*[^a-zA-Z0-9\\s].*";
        String noSpaceRegex = "\\S+";

        if (input.matches(lowercaseRegex) &&
                input.matches(uppercaseRegex) &&
                input.matches(specialCharRegex) &&
                input.matches(noSpaceRegex)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the password:");
        String input = in.nextLine();
        in.close();
        boolean result = verifyPassword(input);
        if (result == true) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }
    }
}
