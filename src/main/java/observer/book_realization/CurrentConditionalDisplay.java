package observer.book_realization;

public class CurrentConditionalDisplay  implements  Observer, DisplayElement{

    private Subject weatherData;

    private float temprature;

    private float humidity;

    private float pressure;

    public CurrentConditionalDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Condition temperuter = " + temprature + " humidity = " + humidity + " pressure = " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
          this.temprature = temp;
          this.humidity = humidity;
          this.pressure = pressure;
          display();
    }
}
