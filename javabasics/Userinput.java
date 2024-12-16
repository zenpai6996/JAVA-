import java.util.Scanner;

public class Userinput {

    public static void main(String[] args) {
        System.out.println("Taking input from user : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int a = sc.nextInt();
        System.out.println("enter second number : ");
        int b = sc.nextInt();
        int sum = a + b ;
        System.out.println("the sum of the two integers is :"+sum);
        sc.close();
    }
    
}
