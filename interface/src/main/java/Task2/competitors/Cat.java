package Task2.competitors;

public class Cat implements Competitors {

    private final double limitDistanceRun;

    private final double limitHeightJump;

    private final String name;

    public Cat(double limitDistanceRun, double limitHeightJump, String name) {
        this.limitDistanceRun = limitDistanceRun;
        this.limitHeightJump = limitHeightJump;
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    public boolean maxDistanceRun(double maxDistanceRun) {
        return limitDistanceRun >= maxDistanceRun;
    }

    @Override
    public boolean maxHeightJump(double maxHeightJump) {
        return limitHeightJump >= maxHeightJump;
    }
}
