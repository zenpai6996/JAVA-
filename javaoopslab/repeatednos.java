import java.util.Scanner;

class repeatednos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        int[] frequency = new int[101];  // Assuming the range of numbers is 0 to 100.

        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
            frequency[numbers[i]]++;  // Increment frequency count for the input number.
        }

        System.out.println("Repeated numbers:");
        boolean repeatedFound = false;

        for (int i = 0; i < 101; i++) {
            if (frequency[i] > 1) {
                System.out.println(i + " is repeated " + frequency[i] + " times");
                repeatedFound = true;
            }
        }

        if (!repeatedFound) {
            System.out.println("No repeated numbers found");
        }

        sc.close();
    }
}
