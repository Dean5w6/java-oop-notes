public class GradeBook {
    private String courseName;

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