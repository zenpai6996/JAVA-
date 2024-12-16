import java.util.Scanner;
public class Strng {
    
    public static void main(String[] args) {
        
       // String name = new String ("Roy");
            String name = "Roy ";
            System.out.print("the name is :");
            System.out.println( name );

        int a = 6;
        float b = 5.678f;
        System.out.printf("the value is %d and %f ",a,b);
        System.out.format("the value is %d and %f",a,b);
        System.out.println(" ");

        Scanner sc = new Scanner (System.in);
        

        System.out.println("enter the name :");
        @SuppressWarnings("unused")
        String st = sc.nextLine();
        
        sc.close();
        

    }
}
