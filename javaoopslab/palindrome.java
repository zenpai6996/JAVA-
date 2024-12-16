import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

       
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

        
        if (isPalindrome(cleanedInput)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }

  
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true;
    }
}
