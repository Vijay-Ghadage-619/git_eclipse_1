import java.util.Scanner;

public class TomJerry {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting number as input from user
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        //conditional checks
        if (number >= 20 && number <= 30) {
            if (number % 2 != 0) {
                System.out.println("Tom");
            } else {
                System.out.println("Jerry");
            }
        } else {
            System.out.println("Inappropriate number entered");
        }

        scanner.close();
    }

}
