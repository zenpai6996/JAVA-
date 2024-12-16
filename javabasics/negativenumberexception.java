import java.util.Scanner;

// Custom exception class
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

// Class to process input
class NumberProcessor {
    // Data member to hold the number
    private int number;

    // Method to process the input
    public void ProcessInput(int number) throws NegativeNumberException {
        this.number = number;
        
        // Check if the number is negative
        if (number < 0) {
            // Throw the custom exception if the number is negative
            throw new NegativeNumberException("Negative numbers are not allowed: " + number);
        }
        
        // Process or display the valid number (for illustration purposes)
        System.out.println("You entered a valid number: " + number);
    }
}

public class negativenumberexception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberProcessor processor = new NumberProcessor();
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        try {
            // Call the ProcessInput method
            processor.ProcessInput(number);
        } catch (NegativeNumberException e) {
            // Catch the NegativeNumberException and display the error message
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Optionally, close the scanner (it's good practice to close resources)
            scanner.close();
        }
    }
}
