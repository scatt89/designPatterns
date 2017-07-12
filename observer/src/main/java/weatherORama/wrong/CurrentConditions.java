package weatherORama.wrong;

/**
 * Created by pirulin on 12/07/2017.
 */
public class CurrentConditions implements Display{
    public String display(WeatherData weatherData) {
        return weatherData.toString();
    }
}
