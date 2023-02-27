import cycle_package.*;

public class Main {
	public static void main(String[] args) {

		createCycle();

	}

	public static void createCycle() {

		final String FIRST_EXERCISE_TXT = "\n1. FIRST EXERCISE:";
		final String SECOND_EXERCISE_TXT = "\n2. SECOND EXERCISE:";
		final String THIRD_EXERCISE_TXT = "\n3. THIRD EXERCISE:";
		final String PRINT_CYCLES_TXT = "\nPRINT CYCLES:";

		int oneSizeCycle = 6;
		int twoSizeCycle = 6;
		String printFirstSymbol = "*";
		String printSecondSymbol = "0";
		String printThirdSymbol = " ";

		FullCycle fullCycle = new FullCycle();
		ContourCycle contourCycle = new ContourCycle();
		TriangularCycle triangularCycle = new TriangularCycle();

		System.out.println(PRINT_CYCLES_TXT);

		System.out.println(FIRST_EXERCISE_TXT);
		fullCycle.fullCycle(oneSizeCycle, twoSizeCycle, printFirstSymbol, printThirdSymbol);

		System.out.println(SECOND_EXERCISE_TXT);
		contourCycle.contourCycle(oneSizeCycle, twoSizeCycle, printFirstSymbol, printThirdSymbol, printSecondSymbol);

		System.out.println(THIRD_EXERCISE_TXT);
		triangularCycle.triangularCycle(oneSizeCycle, twoSizeCycle, printSecondSymbol, printThirdSymbol, printSecondSymbol);
	}

}


