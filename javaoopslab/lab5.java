public class lab5 {

    public static void main(String[] args) {
        // Define two integer variables
        int a = 12;   // In binary: 00001100
        int b = 7;    // In binary: 00000111

        // Perform bitwise AND
        int andResult = a & b;
        System.out.println("Bitwise AND of " + a + " and " + b + " is " + andResult);
        // Binary result: 00000100 (decimal 4)

        // Perform bitwise OR
        int orResult = a | b;
        System.out.println("Bitwise OR of " + a + " and " + b + " is " + orResult);
        // Binary result: 00001111 (decimal 15)

        // Perform bitwise XOR
        int xorResult = a ^ b;
        System.out.println("Bitwise XOR of " + a + " and " + b + " is " + xorResult);
        // Binary result: 00001011 (decimal 11)
    }
}
