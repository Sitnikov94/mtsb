import cycle_package.CycleHomework;

public class Main {
    public static void main(String[] args) {
        createCycle();
        //CycleHomework.createCycle();
    }

    public static void createCycle() {

        int oneSizeCycle = 6;
        int twoSizeCycle = 6;
        final String PRINT_FIRST_SYMBOL = "*";
        final String PRINT_SECOND_SYMBOL = "0";
        final String PRINT_THIRD_SYMBOL = " ";

        CycleHomework CycleHomework = new CycleHomework();
        System.out.println("PRINT CYCLES:");
        CycleHomework.FullCycle(oneSizeCycle, twoSizeCycle, PRINT_FIRST_SYMBOL, PRINT_THIRD_SYMBOL);
        System.out.println();
        CycleHomework.ContourCycle(oneSizeCycle, twoSizeCycle, PRINT_FIRST_SYMBOL, PRINT_THIRD_SYMBOL, PRINT_SECOND_SYMBOL);
        System.out.println();
        CycleHomework.TriangularCycle(oneSizeCycle, twoSizeCycle, PRINT_SECOND_SYMBOL, PRINT_THIRD_SYMBOL, PRINT_SECOND_SYMBOL);
    }
}


