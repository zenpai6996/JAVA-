import java.util.Scanner;
public class passfail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks in physics :");
        byte phy = sc.nextByte();
        System.out.println("enter your marks in maths :");
        byte maths = sc.nextByte();
        System.out.println("enter your marks in biology:");
        byte bio = sc.nextByte();

        
       float avg = (bio + phy + maths )/3.0f;

        if(avg>=40 && bio>=33 && maths >= 33 && phy >= 33){
            System.out.println("congrats you have passes the exam ");
        }else if (avg <40){
            System.out.println("soryy you failed the exam ");
        }else {
            System.out.println("congrats you passes the exam with flying colours ");
        }
        sc.close();
    }
}
