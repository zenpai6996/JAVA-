import java.util.Scanner;

public class NameFormatter{

public static void main (String [] args ){

Scanner sc = new Scanner(System.in);

System.out.print("Enter your first name:");
String firstName = sc.next();

System.out.print("Enter your last name :");
String lastName = sc.next();

sc.close();

System.out.print(firstName + " " + lastName);

}}