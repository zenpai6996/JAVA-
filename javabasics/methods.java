import java.util.Scanner;
public class methods {

    /*  static*/ int logic (int x , int y){
        int z ;
        if(x<y){
            z=x+y;

        }else{
            z=  (x*y)+2;
        }
        return z;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);   
        
        System.out.println("enter the value of a ");
        int a = sc.nextInt();

        System.out.println("enter the value of b");
        int b = sc.nextInt();
        
        //calling a method by creating an object(object method invocation).

        methods obj = new methods();


        int c = obj.logic(a,b);
        System.out.println("the value is :"+c);

        sc.close();
        
    }
    
}
