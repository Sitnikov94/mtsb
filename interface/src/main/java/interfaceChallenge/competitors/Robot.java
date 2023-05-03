package interfaceChallenge.competitors;

public class Robot implements Competitors {

    private final double limitDistanceRun;

    private final double limitHeightJump;

    private final String name;

    public Robot(double limitDistanceRun, double limitHeightJump, String name) {
        this.limitDistanceRun = limitDistanceRun;
        this.limitHeightJump = limitHeightJump;
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public boolean maxDistanceRun(double maxDistanceRun) {
        return limitDistanceRun >= maxDistanceRun;
    }

    @Override
    public boolean maxHeightJump(double maxHeightJump) {
        return limitHeightJump >= maxHeightJump;
    }
}
