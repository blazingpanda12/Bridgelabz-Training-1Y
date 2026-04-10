class RestCheckpoint extends Checkpoint {

    RestCheckpoint(String id, String loc, double dist, double exp, double act) {
        super(id, loc, dist, exp, act);
    }

    String getType() {
        return "Rest";
    }

    double calculatePenalty() {
        // penalty only if delayed more than 30 mins
        if (actualDuration > expectedDuration) {
            double delay = actualDuration - expectedDuration;

            if (delay > 30) {
                return delay * 0.5;
            }
        }
        return 0;
    }
}