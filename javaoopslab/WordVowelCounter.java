import java.util.Scanner;

public class WordVowelCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
    
        int wordCount = countWords(input);
        int vowelCount = countVowels(input);
        
        
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of vowels: " + vowelCount);
        
        scanner.close();
    }

  
    private static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

   
    private static int countVowels(String str) {
        int count = 0;
        String vowels = "AEIOUaeiou"; 
        
        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}
