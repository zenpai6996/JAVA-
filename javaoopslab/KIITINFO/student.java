public class student {
    private int rollNo;
    private String course;

    public student(int rollNo, String course) {
        this.rollNo = rollNo;
        this.course = course;
    }

    public void register() {
        System.out.println("Student with roll no " + rollNo + " has been registered for " + course);
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getCourse() {
        return course;
    }
}