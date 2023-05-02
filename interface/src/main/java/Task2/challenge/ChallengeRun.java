package Task2.challenge;

import Task2.competitors.Competitors;

public class ChallengeRun implements CompetitorsBarrier {

    private final double distance;

    public ChallengeRun(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public boolean competitionParticipants(Competitors competitor) {
        if (competitor.maxDistanceRun(distance)) {
            System.out.println(competitor.name() + " успешно пробежал " + getDistance() + " м");
            return true;
        } else {
            System.out.println(competitor.name() + " не смог(-ла) пробежать " + getDistance() + " м");
            return false;
        }
    }
}
