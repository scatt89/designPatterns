package weatherORama.wrong;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pirulin on 12/07/2017.
 */
public class WeatherData {

    private float temperature;

    private float humidity;

    private float pressure;

    private List<Display> displays;

    public WeatherData() {
        displays = new ArrayList<Display>();
    }

    public void measurementsChanged(){
        for(Display display: displays){
            display.display(this);
        }
    }

    public void subscribeDisplay(Display display){
        displays.add(display);
    }

    public void unsuscribeDisplay(Display display){
        displays.remove(display);
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        measurementsChanged();
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
        measurementsChanged();

    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
        measurementsChanged();

    }

    @Override
    public String toString() {
        return  temperature + " " + humidity + " " + pressure;
    }
}
