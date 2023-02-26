package cycle_package;

public class CycleHomework {
    int firstCounter;
    int secondCounter;


    public void FirstCycle(int END_CYCLE, String printStarSymbol, String printSpaceSymbol) {
        System.out.println("1. FIRST EXERCISE:");
        //print first cycle
        for (firstCounter = 0; firstCounter < END_CYCLE; firstCounter++) {
            for (secondCounter = 0; secondCounter < END_CYCLE; secondCounter++) {
                if (secondCounter != END_CYCLE - 1)
                    System.out.print(printStarSymbol + printSpaceSymbol);
                else
                    System.out.print(printStarSymbol);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void SecondCycle(int END_CYCLE, String printStarSymbol, String printSpaceSymbol, String printNullSymbol) {
        System.out.println("2. SECOND EXERCISE:");
        //print second cycle
        for (firstCounter = 0; firstCounter < END_CYCLE; firstCounter++) {
            for (secondCounter = 0; secondCounter < END_CYCLE; secondCounter++) {
                if (secondCounter < END_CYCLE - 1 && (firstCounter == 0 || firstCounter == END_CYCLE - 1) || secondCounter == 0) {
                    System.out.print(printStarSymbol + printSpaceSymbol);
                } else if (secondCounter == END_CYCLE - 1 && (firstCounter == 0 || firstCounter == END_CYCLE - 1) || firstCounter == END_CYCLE - 1 || secondCounter == END_CYCLE - 1) {
                    System.out.print(printStarSymbol);
                } else
                    System.out.print(printNullSymbol + printSpaceSymbol);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void ThirdCycle(int END_CYCLE, String printStarSymbol, String printSpaceSymbol, String printNullSymbol) {
        System.out.println("3. THIRD EXERCISE:");
        //third first cycle
        for (firstCounter = 0; firstCounter < END_CYCLE; firstCounter++) {
            for (secondCounter = 0; secondCounter < END_CYCLE; secondCounter++) {
                if (firstCounter > secondCounter && secondCounter != END_CYCLE - 1)
                    System.out.print(printNullSymbol + printSpaceSymbol);
                else if (firstCounter == END_CYCLE - 1 && secondCounter == END_CYCLE - 1)
                    System.out.print(printSpaceSymbol);
                else if (firstCounter == secondCounter)
                    System.out.print(printSpaceSymbol + printSpaceSymbol);
                else if (firstCounter < END_CYCLE && secondCounter == END_CYCLE - 1)
                    System.out.print(printStarSymbol);
                else {
                    System.out.print(printStarSymbol + printSpaceSymbol);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
