import java.util.Scanner;

public class IntegerSum {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a series of integers
        System.out.println("Enter integer numbers separated by spaces:");

        int sum = 0;
        boolean allIntegers = true;

        // Read the entire line of input
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        // Process each input value
        for (String number : numbers) {
            try {
                // Try to parse the input as an integer
                int value = Integer.parseInt(number);
                sum += value;
            } catch (NumberFormatException e) {
                // If input is not an integer, set allIntegers to false and display an error message
                allIntegers = false;
                System.out.println("Error: Given values are Non-Integers - " + number);
                break;
            }
        }

        // Display the total sum if all inputs were integers
        if (allIntegers) {
            System.out.println("Total sum: " + sum);
        }

        scanner.close();
    }

}
