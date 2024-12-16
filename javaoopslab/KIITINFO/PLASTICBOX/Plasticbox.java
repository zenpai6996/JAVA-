import java.util.Scanner;

public class Plasticbox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dimensions of the plastic:");
        System.out.print("Length (ft): ");
        double length = scanner.nextDouble();
        System.out.print("Width (ft): ");
        double width = scanner.nextDouble();
        System.out.print("Height (ft) (for 3D box, 0 for 2D sheet): ");
        double height = scanner.nextDouble();

        if (height == 0) {
            TwoDShape twoDShape = new TwoDShape(length, width);
            System.out.println("Cost of 2D sheet: Rs " + twoDShape.calculateCost());
        } else {
            ThreeDShape threeDShape = new ThreeDShape(length, width, height);
            System.out.println("Cost of 3D box: Rs " + threeDShape.calculateCost());
        }
        scanner.close();
    }
}