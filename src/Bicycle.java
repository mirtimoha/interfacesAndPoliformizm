public class Bicycle extends Vehicle {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        if (this != null) {
            this.updateTyresOnVehicle();
        }
    }
}