import java.util.Scanner;

class repeatednumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Repeated numbers:");
        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                    count++;
                    break;
                }
            }
        }
        if (count == 0) {
            System.out.println("No repeated numbers found");
        } else {
            System.out.println("Total repeated numbers: " + count);
        }
        sc.close();
    
    }

}
