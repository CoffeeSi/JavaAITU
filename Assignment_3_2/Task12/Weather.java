package Assignment_3_2.Task12;

public interface Weather extends WeatherType{
    public default String getWeatherType(String type) {
        return type;
    };
}
