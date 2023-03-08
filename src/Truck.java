public class Truck extends Vehicle implements EngineCheckable {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void service() {
        if (this != null) {
            this.updateTyresOnVehicle();
            this.checkEngine();
            this.checkTrailer();
        }
    }
}