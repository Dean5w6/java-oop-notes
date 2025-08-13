public class Employee extends Person {
    private String jobTitle;

    public void setJobTitle(String newJobTitle) {
        this.jobTitle = newJobTitle;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    @Override
    public void introduce() {
        System.out.println("Hello, my name is " + this.name + ", and my job title is " + this.jobTitle);
    }
}
