import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program4 {

    // Method to generate the Fibonacci series and return its sum
    public static int generateFibonacciSum(int num) {
        List<Integer> res = new ArrayList<>();
        int a = 0, b = 1, count = 0;
        
        // Generate Fibonacci series
        while (count < num) {
            res.add(a);
            int next = a + b;
            a = b;
            b = next;
            count++;
        }
        
        // Calculate the sum of the series
        int sum = 0;
        for (int value : res) {
            sum += value;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input number
        System.out.print("Enter the number of terms: ");
        int num = scanner.nextInt();
        
        // Generate the Fibonacci series and compute the sum
        int result = generateFibonacciSum(num);
        
        // Print the result
        System.out.println("The sum of the Fibonacci series up to " + num + " terms is: " + result);
        
        // Close the scanner
        scanner.close();
    }
}
