package cycle_package;

public class CycleHomework {
	int firstCounter;
	int secondCounter;

	//print first cycle
	public void fullCycle(int oneSizeCycle, int twoSizeCycle, String printFirstSymbol, String printThirdSymbol) {

		for (firstCounter = 0; firstCounter < oneSizeCycle; firstCounter++, System.out.println()) {
			for (secondCounter = 0; secondCounter < twoSizeCycle; secondCounter++) {
				System.out.print(printFirstSymbol + printThirdSymbol);
			}
		}
	}

	//print second cycle
	public void contourCycle(int oneSizeCycle, int twoSizeCycle, String printFirstSymbol, String printThirdSymbol, String printSecondSymbol) {

		for (firstCounter = 0; firstCounter < oneSizeCycle; firstCounter++, System.out.println()) {
			for (secondCounter = 0; secondCounter < twoSizeCycle; secondCounter++) {

				if (firstCounter == 0 || secondCounter == 0 || firstCounter == oneSizeCycle - 1 || secondCounter == twoSizeCycle - 1) {
					System.out.print(printFirstSymbol + printThirdSymbol);
				} else {
					System.out.print(printSecondSymbol + printThirdSymbol);
				}

			}
		}
	}

	//third first cycle
	public void triangularCycle(int oneSizeCycle, int twoSizeCycle, String printFirstSymbol, String printThirdSymbol, String printSecondSymbol) {

		for (firstCounter = 0; firstCounter < oneSizeCycle; firstCounter++, System.out.println()) {
			for (secondCounter = 0; secondCounter < twoSizeCycle; secondCounter++) {

				if (firstCounter > secondCounter && secondCounter != twoSizeCycle - 1) {
					System.out.print(printSecondSymbol + printThirdSymbol);
				} else if (firstCounter == secondCounter) {
					System.out.print(printThirdSymbol + printThirdSymbol);
				} else {
					System.out.print(printFirstSymbol + printThirdSymbol);
				}

			}
		}
	}
}