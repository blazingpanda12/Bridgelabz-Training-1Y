import java.util.ArrayList;

class RouteLinkedList {
    ArrayList<Checkpoint> list = new ArrayList<>();

    void addCheckpoint(Checkpoint cp) {
        list.add(cp);
    }

    void printRoute() {
        double totalDistance = 0, totalPenalty = 0;

        for (Checkpoint cp : list) {
            System.out.println(cp.getType() + " - " + cp.locationName +
                    " - Penalty: " + cp.calculatePenalty());

            totalDistance += cp.distanceFromLast;
            totalPenalty += cp.calculatePenalty();
        }

        System.out.println("Total Distance: " + totalDistance);
        System.out.println("Total Penalty: " + totalPenalty);
        System.out.println("Score: " + (totalDistance - totalPenalty));
    }
}