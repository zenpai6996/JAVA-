import java.util.Scanner;

public class CommonDigits {

public static void main ( String [] args ) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the first number :");
int num1 = scanner.nextInt();

System.out.println("Enter the second number :");
int num2 = scanner.nextInt();

String num1Str = String.valueOf(num1);
String num2Str = String.valueOf(num2);

String common = "";
for (char c : num1Str.toCharArray()){
if (num2Str.indexOf(c) != -1){
common += c+"";
}}
System.out.println("Common digits :"+common.trim());
scanner.close();

}}
