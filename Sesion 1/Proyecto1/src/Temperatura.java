import java.util.Optional;

public class Temperatura {
    private Optional<Double> celsius = Optional.empty();
    private Optional<Double> fahrenheit = Optional.empty();

    public double getCelsius() {
        if (fahrenheit.isPresent()) {
            this.celsius = Optional.of((fahrenheit.get() - 32)/1.8);
        }
        return celsius.get();
    }

    public void setCelsius(double celsius) {
        this.celsius = Optional.of(celsius);
        this.fahrenheit = Optional.empty();
    }

    public double getFahrenheit() {
        if (celsius.isPresent()) {
            this.fahrenheit = Optional.of(celsius.get() * 1.8 + 32);
        }
        return this.fahrenheit.get();
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = Optional.of(fahrenheit);
        this.celsius = Optional.empty();
    }
}
