public class Car extends Vehicle {
    private String modelName = "Mustang";

    public String getModelName() {
        return this.modelName;
    }

    @Override
    public void honk() {
        super.honk();
        System.out.println("The " + this.modelName + " goes beep beep!");
    }
}
