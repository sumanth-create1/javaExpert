public class Student {
    final String studentId;
    private String studentName;
    final int enrollmentYear;



    public Student(String studentId, String studentName, int enrollmentYear) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.enrollmentYear = enrollmentYear;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getEnrollmentYear() {
        return enrollmentYear;
    }

    public String getName()
    {
        return studentName;
    }

    public void setName(String name)
    {
        this.studentName = name;
    }

    public void getInfo()
    {
        System.out.println("ID: " + getStudentId() + "Name: " + getName() + "Enrolled: " + getEnrollmentYear());
    }
}
