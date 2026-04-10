class FuelCheckpoint extends Checkpoint {

    FuelCheckpoint(String id, String loc, double dist, double exp, double act) {
        super(id, loc, dist, exp, act);
    }

    String getType() {
        return "Fuel";
    }

    double calculatePenalty() {
        if (isDelayed())
            return 10;
        return 0;
    }
}