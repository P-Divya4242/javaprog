import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    
    // Method to find the maximum value that appears exactly as many times as its value
    public static int eg(List<Integer> ini) {
        List<Integer> res = new ArrayList<>();

        // Count the frequency of each number
        for (int i = 0; i < ini.size(); i++) {
            int count = 0;
            for (int j = 0; j < ini.size(); j++) {
                if (ini.get(i).equals(ini.get(j))) {
                    count++;
                }
            }
            // Check if the count matches the value
            if (count == ini.get(i)) {
                if (!res.contains(ini.get(i))) { // Avoid adding duplicate values
                    res.add(ini.get(i));
                }
            }
        }

        // Return the maximum value or -1 if no such value exists
        if (res.isEmpty()) {
            return -1;
        } else {
            return max(res);
        }
    }

    // Method to find the maximum value in a list
    public static int max(List<Integer> res) {
        int maxVal = res.get(0);
        for (int i = 1; i < res.size(); i++) {
            if (res.get(i) > maxVal) {
                maxVal = res.get(i);
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> ini = new ArrayList<>();

        // Read the input line and split it into individual numbers
        System.out.print("Enter numbers separated by spaces: ");
        String[] input = scanner.nextLine().split(" ");

        // Parse each number and add it to the list
        for (String s : input) {
            try {
                ini.add(Integer.parseInt(s));
            } catch (NumberFormatException e) {
                // Handle invalid input
                System.out.println("Invalid input. Please enter integers only.");
                scanner.close();
                return;
            }
        }

        // Call the method and print the result
        int result = eg(ini);
        System.out.println(result);

        // Close the scanner
        scanner.close();
    }
}
