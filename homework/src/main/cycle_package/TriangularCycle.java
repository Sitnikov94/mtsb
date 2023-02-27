package cycle_package;

public class TriangularCycle {
	int firstCounter;
	int secondCounter;

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
