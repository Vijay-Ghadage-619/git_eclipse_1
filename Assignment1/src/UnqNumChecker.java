import java.util.Scanner;

import java.util.HashSet;

public class UnqNumChecker {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept an integer number as input from the user
        System.out.print("Enter a positive number: ");
        String input = scanner.nextLine();

        // Check if the number is unique
        if (isUniqueNumber(input)) {
            System.out.println(input + " is a unique number.");
        } else {
            System.out.println(input + " is not a unique number.");
        }

        scanner.close();
    }

    // Method to check if a string represents a unique number
    public static boolean isUniqueNumber(String str) {
        // Use a HashSet to store digits and check for duplicates
        HashSet<Character> digits = new HashSet<>();

        // Iterate over each character in the string
        for (char c : str.toCharArray()) {
            // Check if the character is a digit
            if (Character.isDigit(c)) {
                // If the digit is already in the set, it's not unique
                if (!digits.add(c)) {
                    return false;
                }
            } else {
                // If the character is not a digit, the input is invalid
                return false;
            }
        }
        return true;
    }

}
