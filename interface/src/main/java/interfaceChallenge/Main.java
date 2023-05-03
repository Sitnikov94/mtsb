package interfaceChallenge;

import interfaceChallenge.challenge.ChallengeJump;
import interfaceChallenge.challenge.ChallengeRun;
import interfaceChallenge.challenge.CompetitorsBarrier;
import interfaceChallenge.competitors.Cat;
import interfaceChallenge.competitors.Competitors;
import interfaceChallenge.competitors.Human;
import interfaceChallenge.competitors.Robot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Competitors> competitors = new ArrayList<>(Arrays.asList(
                new Human(499, 1.5, "Сергей"),
                new Human(501, 2.6, "Игорь"),
                new Human(550, 2.5, "Ольга"),
                new Cat(500, 2.5, "Барсик"),
                new Cat(654, 2.49, "Тьма"),
                new Robot(100, 3, "R2D2")
        ));

        List<CompetitorsBarrier> obstacles = new ArrayList<>(Arrays.asList(
                new ChallengeJump(1.0),
                new ChallengeRun(250),
                new ChallengeJump(2.0),
                new ChallengeRun(500),
                new ChallengeJump(2.5),
                new ChallengeRun(550)
        ));

        printWinner(runCompetitions(competitors, obstacles));

    }

    public static List<Competitors> runCompetitions(List<Competitors> competitors, List<CompetitorsBarrier> obstacles) {

        for (CompetitorsBarrier obstacle : obstacles) {
            for (int count = 0; count < competitors.size(); count++) {
                if (!obstacle.competitionParticipants(competitors.get(count))) {
                    System.out.println(competitors.get(count).name() + " выбывает из соревнований!");
                    competitors.remove(competitors.get(count));
                    count--;
                }
            }
        }

        return competitors;
    }

    public static void printWinner(List<Competitors> competitors) {
        System.out.println("\nСоревнование завершено!");
        if (competitors.isEmpty()) {
            System.out.println("Все участники не смогли завершить соревнование!");
        } else {
            for (Competitors competitor : competitors) {
                System.out.println(competitor.name() + " прошел(-ла) всю дистанцию!");
            }
        }
    }
}

