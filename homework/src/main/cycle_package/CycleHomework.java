package cycle_package;

public class CycleHomework {
	int firstCounter;
	int secondCounter;

	public static void printCycle() {

		int oneSizeCycle = 6;
		int twoSizeCycle = 6;
		String printFirstSymbol = "*";
		String printSecondSymbol = "0";
		String printThirdSymbol = " ";

		CycleHomework CycleHomework = new CycleHomework();
		System.out.println("PRINT CYCLES:");
		CycleHomework.FullCycle(oneSizeCycle, twoSizeCycle, printFirstSymbol, printThirdSymbol);
		System.out.println();
		CycleHomework.ContourCycle(oneSizeCycle, twoSizeCycle, printFirstSymbol, printThirdSymbol, printSecondSymbol);
		System.out.println();
		CycleHomework.TriangularCycle(oneSizeCycle, twoSizeCycle, printFirstSymbol, printThirdSymbol, printSecondSymbol);
	}

	private void FullCycle(int oneSizeCycle, int twoSizeCycle, String printFirstSymbol, String printThirdSymbol) {
		System.out.println("1. FIRST EXERCISE:");
		//print first cycle
		for (firstCounter = 0; firstCounter < oneSizeCycle; firstCounter++, System.out.println()) {
			for (secondCounter = 0; secondCounter < twoSizeCycle; secondCounter++) {
				if (secondCounter != twoSizeCycle - 1) {
					System.out.print(printFirstSymbol + printThirdSymbol);
				} else {
					System.out.print(printFirstSymbol); //печатаем один символ в конце строки
				}
			}
		}
	}

	private void ContourCycle(int oneSizeCycle, int twoSizeCycle, String printStarSymbol, String printSpaceSymbol, String printNullSymbol) {
		System.out.println("2. SECOND EXERCISE:");
		//print second cycle
		for (firstCounter = 0; firstCounter < oneSizeCycle; firstCounter++, System.out.println()) {
			for (secondCounter = 0; secondCounter < twoSizeCycle; secondCounter++) {
				if (secondCounter < twoSizeCycle - 1 && (firstCounter == 0 || firstCounter == oneSizeCycle - 1) || secondCounter == 0) {
					System.out.print(printStarSymbol + printSpaceSymbol);
				} else if (secondCounter == twoSizeCycle - 1 && (firstCounter == 0 || firstCounter == oneSizeCycle - 1) || firstCounter == oneSizeCycle - 1 || secondCounter == twoSizeCycle - 1) {
					System.out.print(printStarSymbol); //печатаем один символ в конце строки
				} else {
					System.out.print(printNullSymbol + printSpaceSymbol);
				}
			}
		}
	}

	private void TriangularCycle(int oneSizeCycle, int twoSizeCycle, String printStarSymbol, String printSpaceSymbol, String printNullSymbol) {
		System.out.println("3. THIRD EXERCISE:");
		//third first cycle
		for (firstCounter = 0; firstCounter < oneSizeCycle; firstCounter++, System.out.println()) {
			for (secondCounter = 0; secondCounter < twoSizeCycle; secondCounter++) {
				if (firstCounter > secondCounter && secondCounter != twoSizeCycle - 1) {
					System.out.print(printNullSymbol + printSpaceSymbol);
				} else if (firstCounter == secondCounter) {
					System.out.print(printSpaceSymbol + printSpaceSymbol);
				} else if (firstCounter < oneSizeCycle && secondCounter == twoSizeCycle - 1) {
					System.out.print(printStarSymbol); //печатаем один символ в конце строки
				} else {
					System.out.print(printStarSymbol + printSpaceSymbol);
				}
			}
		}
	}
}
