package streamlambdaId;

import streamlambdaId.members.Human;
import streamlambdaId.members.Man;
import streamlambdaId.members.Woman;
import streamlambdaId.printer.ConsolePrinter;
import streamlambdaId.printer.ConsolePrinterList;
import streamlambdaId.printer.ConsolePrinterText;
import streamlambdaId.printer.FilePrinter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) throws IOException {

		//наименование файла
		final String reportFileName = "competitors.txt";
		final String COMPETITORS_RUNNER_TXT = "Участники забега:";

		//возраст
		final int olderThan25 = 25;
		final int olderThan20 = 20;

		List<Human> members = new ArrayList<>(List.of(
				new Man("Сергей", 29),
				new Woman("Анастасия", 24),
				new Man("Андрей", 25),
				new Woman("Анна", 26),
				new Man("Игорь", 20),
				new Woman("Алина", 18),
				new Man("Антон", 20),
				new Woman("Ольга", 25),
				new Man("Денис", 1230),
				new Woman("Ирина", 1)
		));

		//определяем мужчин
		Predicate<Human> man = Human -> (Human instanceof Man);
		//определяем из всех мужчин старше N-возраста
		Predicate<Human> manOlderThen = Human -> Human.getAge() >= olderThan25;
		//определяем женщин
		Predicate<Human> woman = Human -> (Human instanceof Woman);
		//определяем из всех женщин старше N-возраста
		Predicate<Human> womanOlderThen = Human -> Human.getAge() >= olderThan20;
		//сопостовляем всех мужчин и мужчин с опередленным возрастом
		Predicate<Human> participantsMan = man.and(manOlderThen);
		//сопостовляем всех женщин и женщин с опередленным возрастом
		Predicate<Human> participantsWoman = woman.and(womanOlderThen);


		List<String> participantsForTheRace = members.stream()
				.filter(participantsMan.or(participantsWoman))
				.map(Human -> Human.getName().toUpperCase())
				.sorted()
				.toList();

		//для печати в консоль
		ConsolePrinterText printToConsoleText = new ConsolePrinterText();
		ConsolePrinterList printToConsoleList = new ConsolePrinterList();
		ConsolePrinter printToConsole = new ConsolePrinter();

		//для печати в файл
		File file = new File(reportFileName);
		FilePrinter printToFile = new FilePrinter(file);

		printToConsoleText.printToConsole(COMPETITORS_RUNNER_TXT);
		//печать в консоль листом
		printToConsoleList.printToConsole(participantsForTheRace);
		//печать в консоль построчно
		printToConsole.printToConsole(participantsForTheRace);

		//печать в файл
		printToFile.filePrinter(participantsForTheRace);
	}
}