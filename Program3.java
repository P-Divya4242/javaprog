import java.util.Scanner;

public class Program3 {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }

    // Method to calculate the sum of non-prime digits
    public static int sumOfNonPrimeDigits(int number) {
        int sumNonPrimes = 0;
        String numberStr = Integer.toString(number);
        for (char ch : numberStr.toCharArray()) {
            int digit = Character.getNumericValue(ch);
            if (!isPrime(digit)) {
                sumNonPrimes += digit;
            }
        }
        return sumNonPrimes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the integer input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Calculate and display the result
        int result = sumOfNonPrimeDigits(number);
        System.out.println("The sum of non-prime digits in " + number + " is " + result + ".");

        // Close the scanner
        scanner.close();
    }
}
