public class Kiitian extends student {
    public Kiitian(int rollNo, String course) {
        super(rollNo, course);
    }

    public void hostelRequest() {
        System.out.println("Hostel accommodation requested for Kiitian with roll no are being considered :" + getRollNo());
    }
}
