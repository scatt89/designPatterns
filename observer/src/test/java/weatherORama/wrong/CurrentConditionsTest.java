package weatherORama.wrong;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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
        String currentValues = weatherData.toString();
        String spectedValues = 0.0f + " " + 0.0f + " " + 0.0f;
        assertEquals(currentValues, spectedValues);

        generateValues();
        assertNotEquals(weatherData.toString(), spectedValues);
    }

    public void generateValues(){
        weatherData.setPressure(generateRandomVale());
        weatherData.setTemperature(generateRandomVale());
        weatherData.setHumidity(generateRandomVale());
    }

    private float generateRandomVale() {
        return new Random().nextFloat()*100.0f + 0.0f;
    }


}
