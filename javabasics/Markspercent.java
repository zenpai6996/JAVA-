import java.util.Scanner;

public class Markspercent {

    public static void main(String[] args) {
        
        float Total = 500;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks for each subject: ");
        System.out.println("English:");
        float eng = sc.nextFloat();
        System.out.println("physics :");
        float phy = sc.nextFloat();
        System.out.println("chemistry: ");
        float chem = sc.nextFloat();
        System.out.println("biology : ");
        float bio = sc.nextFloat();
        System.out.println("bengali : ");
        float ben = sc.nextFloat();

        float percent = (eng+phy+chem+bio+ben)/Total;
        float answer = percent * 100;

        System.out.println("the percentage secured by the student is :");
        System.out.println(answer);
        sc.close();
    }
    
}
