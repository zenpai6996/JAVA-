import java.util.Scanner;


public class elseif {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age of the person:");
        int age = sc.nextInt();
        if(age >18){
            System.out.println("you are of legal age ");
        }else if (age ==18){
            System.out.println("just turned 18");
        }else{
            System.out.println("you are not of legal age ");
        }
            sc.close();
    }
    
}
