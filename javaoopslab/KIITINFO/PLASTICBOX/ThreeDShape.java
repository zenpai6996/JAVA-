public class ThreeDShape extends TwoDShape {
    private double height;

    public ThreeDShape(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double calculateVolume() {
        return calculateArea() * height;
    }


    public double calculateCost() {
        return calculateVolume() * 60;
    }
}