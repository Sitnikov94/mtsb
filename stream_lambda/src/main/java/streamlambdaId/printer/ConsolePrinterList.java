package streamlambdaId.printer;

import java.io.PrintStream;
import java.util.List;

public class ConsolePrinterList implements Printer {

    private final PrintStream output;

    public ConsolePrinterList() {
        this.output = System.out;
    }

    @Override
    public void printToConsole(List<String> List) {
        output.println(List);
    }

    @Override
    public void printToConsole(String text) {

    }

}
