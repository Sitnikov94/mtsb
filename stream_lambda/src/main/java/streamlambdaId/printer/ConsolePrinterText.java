package streamlambdaId.printer;

import java.io.PrintStream;
import java.util.List;

public class ConsolePrinterText implements Printer {

    private final PrintStream output;

    public ConsolePrinterText() {
        this.output = System.out;
    }

    @Override
    public void printToConsole(List<String> List) {

    }

    @Override
    public void printToConsole(String txt) {
        output.println(txt);
    }

}
