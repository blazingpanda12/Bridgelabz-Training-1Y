abstract class Checkpoint {
    String checkpointId;
    String locationName;
    double distanceFromLast;
    double expectedDuration;
    double actualDuration;

    Checkpoint(String id, String loc, double dist, double exp, double act) {
        this.checkpointId = id;
        this.locationName = loc;
        this.distanceFromLast = dist;
        this.expectedDuration = exp;
        this.actualDuration = act;
    }

    boolean isDelayed() {
        return actualDuration > expectedDuration;
    }

    abstract String getType();
    abstract double calculatePenalty();
}