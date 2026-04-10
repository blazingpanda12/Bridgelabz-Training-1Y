public class Main {
    public static void main(String[] args) {

        Driver d = new Driver("D1204", "Kavita");

        d.route.addCheckpoint(
                new DeliveryCheckpoint("C1", "Warehouse A", 40, 30, 40));

        d.route.addCheckpoint(
                new FuelCheckpoint("C2", "Pump 12", 20, 15, 15));

        d.route.addCheckpoint(
                new RestCheckpoint("C3", "Motel X", 10, 20, 60));

        d.route.addCheckpoint(
                new DeliveryCheckpoint("C4", "Client Hub", 50, 40, 55));

        // Print result
        d.route.printRoute();
    }
}