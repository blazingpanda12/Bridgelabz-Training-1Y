class DeliveryCheckpoint extends Checkpoint {

    DeliveryCheckpoint(String id, String loc, double dist, double exp, double act) {
        super(id, loc, dist, exp, act);
    }

    String getType() {
        return "Delivery";
    }

    double calculatePenalty() {
        if (isDelayed())
            return (actualDuration - expectedDuration) * 2;
        return 0;
    }
}