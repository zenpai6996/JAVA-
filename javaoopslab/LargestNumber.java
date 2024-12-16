import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers (type 'done' to finish): ");
        int largest = scanner.nextInt();

        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            int num = Integer.parseInt(input);
            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("Largest number: " + largest);
        scanner.close();
        
    }
}