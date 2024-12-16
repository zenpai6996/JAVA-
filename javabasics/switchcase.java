import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age :");
        int age = sc.nextInt();

        switch(age){
        
            case 18: 
            System.out.println("you just turned 18");
            break;

            case 23:
            System.out.println("find a job ");
            break;

            case 60:
            System.out.println("might retire");
            break;

            default:

            System.out.println("enjoy your life ");



        }
        sc.close();
    }
    
}
