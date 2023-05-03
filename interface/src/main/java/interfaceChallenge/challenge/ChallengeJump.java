package interfaceChallenge.challenge;

import interfaceChallenge.competitors.Competitors;

public class ChallengeJump implements CompetitorsBarrier {

    private final double height;

    public ChallengeJump(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean competitionParticipants(Competitors competitor) {
        if (competitor.maxHeightJump(height)) {
            System.out.println(competitor.name() + " успешно перепрыгнул " + getHeight() + " м");
            return true;
        } else {
            System.out.println(competitor.name() + " не смог(-ла) перепрыгнуть " + getHeight() + " м");
            return false;
        }
    }
}
