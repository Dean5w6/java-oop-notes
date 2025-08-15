public class GradeBook {
    private String courseName;

    // This is the constructor
    public GradeBook(String name) {
        courseName = name;
    }
    // End of the constructor

    public void setCourseName(String newCourseName) {
        courseName = newCourseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + getCourseName() + "!");
    }
}