package interfaceConvert;

public class Main {
    public static void main(String[] args) {
        ConverterToKelvin converterToKelvin = new ConverterToKelvin();
        converterToKelvin.convert(22);
        converterToKelvin.convert(27.4);

        ConverterToFahrenheit ConvertToFahrenheit = new ConverterToFahrenheit();
        ConvertToFahrenheit.convert(24);
        ConvertToFahrenheit.convert(13.6);
    }
}