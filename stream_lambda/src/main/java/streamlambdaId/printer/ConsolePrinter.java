package streamlambdaId.printer;

import java.io.PrintStream;
import java.util.List;

public class ConsolePrinter implements Printer {

	private final PrintStream output;

	public ConsolePrinter() {
		this.output = System.out;
	}

	@Override
	public void printToConsole(List<String> list) {
		list.forEach(output::println);
	}

	@Override
	public void printToConsole(String text) {

	}

}
