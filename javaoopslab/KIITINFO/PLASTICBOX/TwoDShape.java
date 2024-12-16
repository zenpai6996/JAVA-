public class TwoDShape {
    private double length;
    private double width;

    public TwoDShape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculateCost() {
        return calculateArea() * 40;
    }
}