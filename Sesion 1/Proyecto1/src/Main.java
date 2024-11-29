import java.util.List;

public class Main {

    public static void main(String[] args) {
        Temperatura[] temperatures = new Temperatura[100];

        // Toma de datos
        for (int i = 0; i < temperatures.length; i++){
            temperatures[i] = new Temperatura();
            temperatures[i].setCelsius(leeSensorCelsius());
        }



        // Cálculo con los datos en Celsius
        double mediaCelsius = 0;
        for (int i = 0; i < temperatures.length; i++)
            mediaCelsius += temperatures[i].getCelsius();
        mediaCelsius = mediaCelsius / temperatures.length;
        System.out.println(mediaCelsius);

        // Cálculo con los datos en Fahrenheit
        double mediaFahrenheit = 0;
        for (int i = 0; i < temperatures.length; i++)
            mediaFahrenheit += temperatures[i].getFahrenheit();
        mediaFahrenheit = mediaFahrenheit / temperatures.length;
        System.out.println(mediaFahrenheit);

        // Otro cálculo con los datos en Fahrenheit
        double varianza = 0;
        for (int i = 0; i < temperatures.length; i++)
            varianza += Math.pow((temperatures[i].getFahrenheit()) - mediaFahrenheit, 2);
        varianza = varianza / temperatures.length;
        System.out.println(varianza);
    }

    public static double leeSensorCelsius() {
        return Math.random() * 30;
    }


}
