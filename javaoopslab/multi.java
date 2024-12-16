public class multi {
    public int multiplication(int a, int b) {
        return a * b;
	}
    public int multiplication(int a, int b, int c) {
        return a * b * c;
    }
    public double multiplication(double a, double b) {
        return a * b;
    }

  	 public static void main(String[] args) {
	     multi m = new multi();

	     int result1 = m.multiplication(10, 55);
	     System.out.println("10 * 55 = " + result1);

	     int result2 = m.multiplication(20, 13, 45);
	     System.out.println("20 * 13 * 45 = " + result2);

	     double result3 = m.multiplication(21.5, 30.5);
	     System.out.println("21.5 * 30.5 = " + result3);
	 }
}
