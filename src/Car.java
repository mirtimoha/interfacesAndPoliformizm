public class Car extends Vehicle implements EngineCheckable {

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}