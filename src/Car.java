public class Car extends Vehicle implements EngineCheckable {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public void service() {
        if (this != null) {
            this.updateTyresOnVehicle();
            this.checkEngine();
        }
    }
}