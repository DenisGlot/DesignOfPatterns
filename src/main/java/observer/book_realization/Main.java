package observer.book_realization;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionalDisplay ccd = new CurrentConditionalDisplay(weatherData);
        //Here could be many observers
        weatherData.setMesurements(.5f,-6.4f,1.1f);
    }
}
