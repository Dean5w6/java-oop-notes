public class Dog implements Animal {
    public String name;
    private int age;

    public void setAge(int newAge) {
        if (newAge > 0) {
            this.age = newAge;
        }
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating kibble.");
    }
}