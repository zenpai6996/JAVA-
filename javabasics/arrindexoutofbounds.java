public class arrindexoutofbounds {
    public static void main(String[] args) {
        // Create an array of 3 integers
        int[] numbers = {10, 20, 30};

        try {
            // Trying to access an index outside the array bounds (index 5)
            System.out.println("Accessing index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the ArrayIndexOutOfBoundsException
            System.out.println("Exception caught: " + e);
            System.out.println("Index out of bounds. Please check the array size.");
        }

        // Other code that will continue execution after catching the exception
        System.out.println("Program continues after handling the exception.");
    }
}
