package observer.realization_from_java;

import java.util.Observable;

public class WeatherData extends Observable{
    private float temprature;

    private float humidity;

    private float pressure;

    public void setMesurements(float temprature,float humidity,float pressure){
        this.temprature = temprature;
        this.humidity = humidity;
        this.pressure= pressure;
        setChanged();
        notifyObservers();
    }

    //Getters and Setters


    public float getTemprature() {
        return temprature;
    }

    public void setTemprature(float temprature) {
        this.temprature = temprature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
