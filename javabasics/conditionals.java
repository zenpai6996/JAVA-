import java.util.Scanner;

public class conditionals {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age of the driver ");
        int age = sc.nextInt();
        boolean cond = (age == 18);

        if(cond){
            System.out.println("can drive");

        }else {
            System.out.println("not legal cant drive");
        }
        sc.close();
    }
    
}
