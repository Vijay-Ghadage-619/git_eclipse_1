import java.util.Scanner;

public class Palidrome {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        // Check if the number is a palindrome
        if (isPalindromeNum(input)) {
            int evenDigitSum = sumEvenDigits(input);
            if (evenDigitSum > 25) {
                System.out.println(input + " is a palindrome and the sum of even numbers is greater than 25");
            } else {
                System.out.println(input + " is a palindrome and the sum of even numbers is less than or equal to 25");
            }
        } else {
            System.out.println(input + " is not a palindrome");
        }

        scanner.close();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindromeNum(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // Method to sum the even digits in a string
    public static int sumEvenDigits(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            int digit = Character.getNumericValue(c);
            if (digit % 2 == 0) {
                sum += digit;
            }
        }
        return sum;
    }
}



