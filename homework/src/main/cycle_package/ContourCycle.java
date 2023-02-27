package cycle_package;

public class ContourCycle {

	int firstCounter;
	int secondCounter;

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
}
