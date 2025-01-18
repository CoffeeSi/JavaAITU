package Assignment_3_3.Task14;

public class Solution {
    public static void showWeather(City city) {
        System.out.printf("In the city of " + city.getName() + 
                        " today, the temperature is " + city.getTemperature());
    }

    public static void main(String[] args) {
        City astana = new City("Astana", -12);
        showWeather(astana);
    }
}
