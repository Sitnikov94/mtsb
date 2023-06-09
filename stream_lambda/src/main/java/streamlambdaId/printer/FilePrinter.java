package streamlambdaId.printer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FilePrinter implements Printer {

	private final FileWriter fileWriter;

	public FilePrinter(File file) throws IOException {
		this.fileWriter = new FileWriter(file);
	}


	public void filePrinter(List<String> List) throws IOException {
		for (String s : List) {
			fileWriter.write(s);
			fileWriter.append('\n');
			fileWriter.flush();
		}

	}

	@Override
	public void printToConsole(List<String> List) {

	}

	@Override
	public void printToConsole(String text) {

	}

}
