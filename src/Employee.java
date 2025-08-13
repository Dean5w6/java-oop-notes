public class Employee extends Person {
    private String jobTitle;

    public Employee(String name, String jobTitle) {
        super(name);
        this.jobTitle = jobTitle;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println(". my job title is " + this.jobTitle);
    }
}
