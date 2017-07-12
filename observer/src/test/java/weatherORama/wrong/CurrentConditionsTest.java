package weatherORama.wrong;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by pirulin on 12/07/2017.
 */
public class CurrentConditionsTest {

    private WeatherData weatherData = new WeatherData();
    private Display currentConditions = new CurrentConditions();

    @Before
    public void setup(){
        weatherData.subscribeDisplay(currentConditions);
    }

    @Test
    public void measurementsChangedTest(){
        String currentValues = weatherData.getTemperature() + " " + weatherData.getHumidity() + " " + weatherData.getPressure();
        String spectedValues = 0.0f + " " + 0.0f + " " + 0.0f;
        assertEquals(currentValues, spectedValues);
    }

}
