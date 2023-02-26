import cycle_package.CycleHomework;

public class Main {
    public static void main(String[] args) {

        printCycle();
    }

    private static void printCycle() {

        final int END_CYCLE = 6;
        String printStarSymbol = "*";
        String printSpaceSymbol = " ";
        String printNullSymbol = "0";

        System.out.println("PRINT CYCLES:");
        CycleHomework CycleHomework = new CycleHomework();
        CycleHomework.FirstCycle(END_CYCLE, printStarSymbol, printSpaceSymbol);
        CycleHomework.SecondCycle(END_CYCLE, printStarSymbol, printSpaceSymbol, printNullSymbol);
        CycleHomework.ThirdCycle(END_CYCLE, printStarSymbol, printSpaceSymbol, printNullSymbol);
    }

}


