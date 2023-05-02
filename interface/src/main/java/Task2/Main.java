package Task2;

import Task2.challenge.ChallengeJump;
import Task2.challenge.ChallengeRun;
import Task2.challenge.CompetitorsBarrier;
import Task2.competitors.Cat;
import Task2.competitors.Competitors;
import Task2.competitors.Human;
import Task2.competitors.Robot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Competitors> competitors = new ArrayList<>(Arrays.asList(
                new Human(499, 1.5, "Сергей"),
                new Human(501, 2.6, "Игорь"),
                new Cat(500, 2.5, "Барсик"),
                new Cat(654, 2.49, "Тьма"),
                new Robot(100, 3, "R2D2")
        ));

        List<CompetitorsBarrier> obstacles = new ArrayList<>(Arrays.asList(
                new ChallengeJump(1.0),
                new ChallengeRun(250),
                new ChallengeJump(2.0),
                new ChallengeRun(500),
                new ChallengeJump(3.0),
                new ChallengeRun(550)
        ));

        runCompetitions(competitors, obstacles);

    }

    public static void runCompetitions(List<Competitors> competitors, List<CompetitorsBarrier> obstacles) {

        for (CompetitorsBarrier obstacle : obstacles) {
            for (int j = 0; j < competitors.size(); j++) {
                if (!obstacle.competitionParticipants(competitors.get(j))) {
                    System.out.println(competitors.get(j).name() + " выбывает из соревнований!");
                    competitors.remove(competitors.get(j));
                    j--;
                }
            }
        }

        printWinner(competitors);

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

