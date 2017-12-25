package observer.book_realization;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;

    private float temprature;

    private float humidity;

    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
         observers.forEach(item -> item.update(temprature,humidity,pressure));
    }

    public void setMesurements(float temprature,float humidity,float pressure){
        this.temprature = temprature;
        this.humidity = humidity;
        this.pressure= pressure;
        notifyObservers();
    }

    //Getters and Setters

    public float getTemprature() {
        return temprature;
    }

    public void setTemprature(float temprature) {
        this.temprature = temprature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}
