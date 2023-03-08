public class ServiceStation {
    private void serviceIfExists(Diagnosticable diagnosticable) {
        if (diagnosticable != null) {
            diagnosticable.service();
        }
    }
    public void check(Car car, Bicycle bicycle, Truck truck) {
        serviceIfExists(car);
        serviceIfExists(bicycle);
        serviceIfExists(truck);
    }
}