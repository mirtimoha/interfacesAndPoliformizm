public class ServiceStation {

    private void updateTyre(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
    }
    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            updateTyre(car);
            car.checkEngine();
        } else if (truck != null) {
            updateTyre(truck);
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null) {
            updateTyre(bicycle);
        }
    }
}