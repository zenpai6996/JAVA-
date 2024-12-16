import java.util.Scanner;

class Plastic2d{
    double length ;
    double width;

    public Plastic2d(double length , double width ){
        this.length= length;
        this.width = width;

    }
    public double calculatearea(){
        return length*width;

    }

    public double calculatecost(){
        double area = calculatearea();
        return area * 40;

    }


}

class Plastic3d extends Plastic2d{
    double height ;
    
    public Plastic3d( double length , double width , double height){
        super(length,width );
        this.height = height;
    }
    public double calculatevolume(){
        return length*height*width;

    }
    @Override
    public double calculatecost(){
        double volume = calculatevolume();
        return volume *60;

    }
}
public class pratice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

         System.out.println("Enter the type of plastic (1 for 2D sheet, 2 for 3D box): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            // For 2D plastic sheet
            System.out.println("Enter the length of the plastic sheet (in ft): ");
            double length = scanner.nextDouble();

            System.out.println("Enter the width of the plastic sheet (in ft): ");
            double width = scanner.nextDouble();

            Plastic2d sheet = new Plastic2d(length, width);
            double cost = sheet.calculatecost();
            System.out.println("The cost of the plastic sheet is: Rs " + cost);
        } else if (choice == 2) {
            // For 3D plastic box
            System.out.println("Enter the length of the plastic box (in ft): ");
            double length = scanner.nextDouble();

            System.out.println("Enter the width of the plastic box (in ft): ");
            double width = scanner.nextDouble();

            System.out.println("Enter the height of the plastic box (in ft): ");
            double height = scanner.nextDouble();

            Plastic3d box = new Plastic3d(length, width, height);
            double cost = box.calculatecost();
            System.out.println("The cost of the plastic box is: Rs " + cost);
        } else {
            System.out.println("Invalid choice! Please enter 1 for 2D sheet or 2 for 3D box.");
        }

        scanner.close();
        
    }
}