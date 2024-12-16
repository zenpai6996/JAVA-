import java.util.Scanner;

class Box {
    public double length;
    public double width;
    public double height;

    public Box(){
		this.length = 0;
		this.width = 0;
		this.height =0;
	}
	public Box(double side){
		this.length = side;
		this.width = side;
		this.height =side;
	}
	public Box(double length,double width,double height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
	public double volume(){
		return this.length*this.height*this.width;
	}
}

	public class BoxTest {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);


	        Box box1 = new Box();
	        System.out.println("Volume of box1: " + box1.volume());


	        System.out.print("Enter the side of the box: ");
	        double side = scanner.nextDouble();
	        Box box2 = new Box(side);
	        System.out.println("Volume of box2: " + box2.volume());

	        System.out.print("Enter the length of the box: ");
	        double length = scanner.nextDouble();
	        System.out.print("Enter the width of the box: ");
	        double width = scanner.nextDouble();
	        System.out.print("Enter the height of the box: ");
	        double height = scanner.nextDouble();
	        Box box3 = new Box(length, width, height);
	        System.out.println("Volume of box3: " + box3.volume());
				scanner.close();
	    }
		
}

