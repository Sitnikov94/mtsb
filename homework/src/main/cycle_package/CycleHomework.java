package cycle_package;

public class CycleHomework {
    int firstCounter;
    int secondCounter;

    public static void printCycle() {

        int sizeCycle = 6;
        String printFirstSymbol = "*";
        String printSecondSymbol = "0";
        String printThirdSymbol = " ";

        System.out.println("PRINT CYCLES:");
        CycleHomework CycleHomework = new CycleHomework();
        CycleHomework.FirstCycle(sizeCycle, printFirstSymbol, printThirdSymbol);
        System.out.println();
        CycleHomework.SecondCycle(sizeCycle, printFirstSymbol, printThirdSymbol, printSecondSymbol);
        System.out.println();
        CycleHomework.ThirdCycle(sizeCycle, printFirstSymbol, printThirdSymbol, printSecondSymbol);
    }

    private void FirstCycle(int END_CYCLE, String printStarSymbol, String printSpaceSymbol) {
        System.out.println("1. FIRST EXERCISE:");
        //print first cycle
        for (firstCounter = 0; firstCounter < END_CYCLE; firstCounter++) {
            for (secondCounter = 0; secondCounter < END_CYCLE; secondCounter++) {
                if (secondCounter != END_CYCLE - 1)
                    System.out.print(printStarSymbol + printSpaceSymbol);
                else
                    System.out.print(printStarSymbol);//печатаем один символ в конце строки
            }
            System.out.println();
        }
    }

    private void SecondCycle(int END_CYCLE, String printStarSymbol, String printSpaceSymbol, String printNullSymbol) {
        System.out.println("2. SECOND EXERCISE:");
        //print second cycle
        for (firstCounter = 0; firstCounter < END_CYCLE; firstCounter++) {
            for (secondCounter = 0; secondCounter < END_CYCLE; secondCounter++) {
                if (secondCounter < END_CYCLE - 1 && (firstCounter == 0 || firstCounter == END_CYCLE - 1) || secondCounter == 0) {
                    System.out.print(printStarSymbol + printSpaceSymbol);
                } else if (secondCounter == END_CYCLE - 1 && (firstCounter == 0 || firstCounter == END_CYCLE - 1) || firstCounter == END_CYCLE - 1 || secondCounter == END_CYCLE - 1) {
                    System.out.print(printStarSymbol); //печатаем один символ в конце строки
                } else
                    System.out.print(printNullSymbol + printSpaceSymbol);
            }
            System.out.println();
        }
    }

    private void ThirdCycle(int END_CYCLE, String printStarSymbol, String printSpaceSymbol, String printNullSymbol) {
        System.out.println("3. THIRD EXERCISE:");
        //third first cycle
        for (firstCounter = 0; firstCounter < END_CYCLE; firstCounter++) {
            for (secondCounter = 0; secondCounter < END_CYCLE; secondCounter++) {
                if (firstCounter > secondCounter && secondCounter != END_CYCLE - 1)
                    System.out.print(printNullSymbol + printSpaceSymbol);
                else if (firstCounter == END_CYCLE - 1 && secondCounter == END_CYCLE - 1)
                    System.out.print(printSpaceSymbol); //печатаем один символ в конце строки
                else if (firstCounter == secondCounter)
                    System.out.print(printSpaceSymbol + printSpaceSymbol);
                else if (firstCounter < END_CYCLE && secondCounter == END_CYCLE - 1)
                    System.out.print(printStarSymbol); //печатаем один символ в конце строки
                else {
                    System.out.print(printStarSymbol + printSpaceSymbol);
                }
            }
            System.out.println();
        }
    }
}
