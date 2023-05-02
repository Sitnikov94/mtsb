package interfaceConvert;

public class ConverterToKelvin implements TakeForConverterCelsius {
    private final String TXT_CELSIUS_TO_KELVIN = "Результат конвертация Цельсий в Кельвины: ";
    private final String TXT_DESIGNATION_KELVIN = " K";

    private final double CONSTANT_COEFFICIENT_KELVIN = 273.15;

    @Override
    public void convert(int celsius) {
        System.out.println(TXT_CELSIUS_TO_KELVIN +
                (celsius + CONSTANT_COEFFICIENT_KELVIN) +
                TXT_DESIGNATION_KELVIN);
    }

    @Override
    public void convert(double celsius) {

        double result = celsius + CONSTANT_COEFFICIENT_KELVIN;
        System.out.printf("%s%.2f%s%n",TXT_CELSIUS_TO_KELVIN, result, TXT_DESIGNATION_KELVIN);

        /*
        System.out.println(TXT_CELSIUS_TO_KELVIN +
                celsius + CONSTANT_COEFFICIENT_KELVIN +
                TXT_DESIGNATION_KELVIN);
        */
    }
}
