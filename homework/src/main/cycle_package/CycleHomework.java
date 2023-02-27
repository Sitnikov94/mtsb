package cycle_package;

public class CycleHomework {
	int firstCounter;
	int secondCounter;
	final String FIRST_EXERCISE_TXT = "1. FIRST EXERCISE:";
	final String SECOND_EXERCISE_TXT = "2. SECOND EXERCISE:";
	final String THIRD_EXERCISE_TXT = "3. THIRD EXERCISE:";

	//	public static void createCycle() {
//
//		int oneSizeCycle = 6;
//		int twoSizeCycle = 6;
//		String printFirstSymbol = "*";
//		String printSecondSymbol = "0";
//		String printThirdSymbol = " ";
//
//		CycleHomework CycleHomework = new CycleHomework();
//		System.out.println("PRINT CYCLES:");
//		CycleHomework.FullCycle(oneSizeCycle, twoSizeCycle, printFirstSymbol, printThirdSymbol);
//		System.out.println();
//		CycleHomework.ContourCycle(oneSizeCycle, twoSizeCycle, printFirstSymbol, printThirdSymbol, printSecondSymbol);
//		System.out.println();
//		CycleHomework.TriangularCycle(oneSizeCycle, twoSizeCycle, printFirstSymbol, printThirdSymbol, printSecondSymbol);
//	}
	public void FullCycle(int oneSizeCycle, int twoSizeCycle, String printFirstSymbol, String printThirdSymbol) {
		System.out.println(FIRST_EXERCISE_TXT);
		//print first cycle
		for (int firstCounter = 0; firstCounter < oneSizeCycle; firstCounter++, System.out.println()) {
			for (int secondCounter = 0; secondCounter < twoSizeCycle; secondCounter++) {
				if (secondCounter != twoSizeCycle - 1) {
					System.out.print(printFirstSymbol + printThirdSymbol);
				} else {
					System.out.print(printFirstSymbol); //печатаем один символ в конце строки
				}
			}
		}
	}

	public void ContourCycle(int oneSizeCycle, int twoSizeCycle, String printFirstSymbol, String printThirdSymbol, String printSecondSymbol) {
		System.out.println(SECOND_EXERCISE_TXT);
		//print second cycle
		for (firstCounter = 0; firstCounter < oneSizeCycle; firstCounter++, System.out.println()) {
			for (secondCounter = 0; secondCounter < twoSizeCycle; secondCounter++) {
				if (secondCounter < twoSizeCycle - 1 && (firstCounter == 0 || firstCounter == oneSizeCycle - 1) || secondCounter == 0) {
					System.out.print(printFirstSymbol + printThirdSymbol);
				} else if (secondCounter == twoSizeCycle - 1 && (firstCounter == 0 || firstCounter == oneSizeCycle - 1) || firstCounter == oneSizeCycle - 1 || secondCounter == twoSizeCycle - 1) {
					System.out.print(printFirstSymbol); //печатаем один символ в конце строки
				} else {
					System.out.print(printSecondSymbol + printThirdSymbol);
				}
			}
		}
	}

	public void TriangularCycle(int oneSizeCycle, int twoSizeCycle, String printFirstSymbol, String printThirdSymbol, String printSecondSymbol) {
		System.out.println(THIRD_EXERCISE_TXT);
		//third first cycle
		for (firstCounter = 0; firstCounter < oneSizeCycle; firstCounter++, System.out.println()) {
			for (secondCounter = 0; secondCounter < twoSizeCycle; secondCounter++) {
				if (firstCounter > secondCounter && secondCounter != twoSizeCycle - 1) {
					System.out.print(printSecondSymbol + printThirdSymbol);
				} else if (firstCounter == secondCounter) {
					System.out.print(printThirdSymbol + printThirdSymbol);
				} else if (firstCounter < oneSizeCycle && secondCounter == twoSizeCycle - 1) {
					System.out.print(printFirstSymbol); //печатаем один символ в конце строки
				} else {
					System.out.print(printFirstSymbol + printThirdSymbol);
				}
			}
		}
	}
}