package interfaceConvert;

public class ConverterToFahrenheit implements TakeForConverterCelsius {
    private final String TXT_CELSIUS_TO_FAHRENHEIT = "Результат конвертация Цельсий в Фаренгейты: ";
    private final String TXT_DESIGNATION_FAHRENHEIT = " ℉";
    private final double CONSTANT_FIRST_COEFFICIENT_FAHRENHEIT = 1.8;
    private final int CONSTANT_SECOND_COEFFICIENT_FAHRENHEIT = 32;


    @Override
    public void convert(int celsius) {

        System.out.println(TXT_CELSIUS_TO_FAHRENHEIT +
                (CONSTANT_FIRST_COEFFICIENT_FAHRENHEIT * celsius + CONSTANT_SECOND_COEFFICIENT_FAHRENHEIT) +
                TXT_DESIGNATION_FAHRENHEIT);
    }

    public void convert(double celsius) {
        double result = CONSTANT_FIRST_COEFFICIENT_FAHRENHEIT * celsius + CONSTANT_SECOND_COEFFICIENT_FAHRENHEIT;
        System.out.printf("%s%.2f%s%n", TXT_CELSIUS_TO_FAHRENHEIT, result, TXT_DESIGNATION_FAHRENHEIT);

        /*
        System.out.println(TXT_CELSIUS_TO_FAHRENHEIT +
                CONSTANT_FIRST_COEFFICIENT_FAHRENHEIT * celsius + CONSTANT_SECOND_COEFFICIENT_FAHRENHEIT +
                TXT_DESIGNATION);
        */
    }
}
