import java.util.Scanner;

public class Program1 {

    public static String changePassword(String oldPassword) {
        if (oldPassword == null || oldPassword.isEmpty()) {
            return null;
        }

        StringBuilder newPassword = new StringBuilder();

        for (char ch : oldPassword.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                newPassword.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                newPassword.append(Character.toLowerCase(ch));
            } else {
                // If the character is not a letter, return null
                return null;
            }
        }

        return newPassword.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the old password: ");
        String oldPassword = scanner.nextLine();

        // Converting the password
        String newPassword = changePassword(oldPassword);

        // Displaying the result
        if (newPassword != null) {
            System.out.println("New Password: " + newPassword);
        } else {
            System.out.println("null");
        }

        scanner.close();
    }
}
