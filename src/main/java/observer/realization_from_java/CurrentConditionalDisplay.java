package observer.realization_from_java;

import observer.book_realization.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionalDisplay implements Observer,DisplayElement {

    private Observable observable;

    private float temprature;

    private float humidity;

    private float pressure;

    public CurrentConditionalDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver( this);
    }

    @Override
    public void display() {
        System.out.println("Current Condition temperuter = " + temprature + " humidity = " + humidity + " pressure = " + pressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof  WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temprature = weatherData.getTemprature();

            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
