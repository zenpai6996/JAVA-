public class nullpointerexeption {
    public static void main(String[] args) {
        // Creating a null reference
        String str = null;
        
        try {
            // Attempting to call a method on the null reference
            int length = str.length();  // This will throw a NullPointerException
        } catch (NullPointerException e) {
            // Handling the NullPointerException
            System.out.println("A NullPointerException was caught!");
            System.out.println("Error message: " + e.getMessage());
            System.out.println("Exception details: ");
            e.printStackTrace();  // Print the stack trace for debugging
        }
    }
}
