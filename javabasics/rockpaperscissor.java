import java.util.Scanner;
import java.util.Random;
public class rockpaperscissor {

    public static void main(String[] args) {
        System.out.println("\tselect 0 for rock\n\tselect 1 for paper \n\tselect 2  for scissor ");
        Scanner sc = new Scanner(System.in);
        Random rc = new Random();
        int human = sc.nextInt(3);
        if(human ==0){
            System.out.println("you have selected rock\n");
        }else if(human == 1){
            System.out.println("you have selected paper \n");
        }else if (human == 2){
            System.out.println("you have selected scissor \n");

        }
        System.out.println("now its the computers turn \n");
        int computer = rc.nextInt(3);
        if(computer == 0){
            System.out.println("the computer has selected rock\n");
        }else if(computer == 1){
            System.out.println("the computer has selected paper \n");
        }else if (computer ==2 ){
            System.out.println("the computer has selcted scissor\n");
        }
        System.out.println("results\n");
        if(computer == human ){
            System.out.println("the match is a draw\n ");
        }else if(human == 0 && computer == 2 || human == 1 && computer == 0 || human == 2 && computer == 1){
            System.out.println("congratulations you have won\n");
        }else {
            System.out.println("you lose \n better luck next time");
        }
        sc.close();
    }
}
