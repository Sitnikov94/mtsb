package streamlambdaId;

import streamlambdaId.members.Human;
import streamlambdaId.members.Man;
import streamlambdaId.members.Woman;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import streamlambdaId.printer.ConsolePrinter;
import streamlambdaId.printer.FilePrinter;
import streamlambdaId.printer.Printer;

public class Main {

    public static void main(String[] args) throws IOException {

        final String reportFileName = "report.txt";

        final int orderThan25 = 25;
        final int orderThan20 = 20;


        List<Human> members = new ArrayList<>(List.of(
                new Man("Сергей", 29),
                new Woman("Анастасия", 24),
                new Man("Андрей", 25),
                new Woman("Анна", 26),
                new Man("Игорь", 20),
                new Woman("Алина", 18),
                new Man("Антон", 20),
                new Woman("Ольга", 25),
                new Man("R2D2", 1230),
                new Woman("Тьма", 1)
        ));


        Predicate<Human> man = Human -> (Human instanceof Man);
        Predicate<Human> manOrderThan = Human -> Human.getAge() >= orderThan25;
        Predicate<Human> woman = Human -> (Human instanceof Woman);
        Predicate<Human> womanOrderThan = Human -> Human.getAge() >= orderThan20;


        List<String> membersManOrderThan25 = new UpperNameAndSorterListAsc(members, man, manOrderThan).UpperSorterListMembers();
        List<String> membersWomanOrderThan25 = new UpperNameAndSorterListAsc(members, woman, womanOrderThan).UpperSorterListMembers();


        ConsolePrinter printToConsole = new ConsolePrinter();

        printToConsole.printToConsole(membersManOrderThan25);
        printToConsole.printToConsole(membersWomanOrderThan25);


        File file = new File(reportFileName);
        FilePrinter printToFile = new FilePrinter(file);

        printToFile.filePrinter(membersManOrderThan25);
        printToFile.filePrinter(membersWomanOrderThan25);

/*
        System.out.println(new UpperNameAndSorterListAsc(members, man, manOrderThan).UpperSorterListMembers());
        System.out.println(new UpperNameAndSorterListAsc(members, woman, womanOrderThan).UpperSorterListMembers());
*/

    }
}