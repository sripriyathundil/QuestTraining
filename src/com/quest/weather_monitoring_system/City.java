package com.quest.weather_monitoring_system;

public class City {
    private String cityName;
    private double temperature;
    private int humidity;
    private String condition;

    public City(String cityName, double temperature, int humidity, String condition) {
        this.cityName = cityName;
        this.temperature = temperature;
        this.humidity = humidity;
        this.condition = condition;
    }
    public String getCityName() {
        return cityName;
    }
    public double getTemperature() {
        return temperature;
    }
    public int getHumidity() {
        return humidity;
    }
    public String getCondition() {
        return condition;
    }
    public void setWeather(double temperature, int humidity, String condition) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.condition = condition;
    }
    @Override
    public String toString() {
        return "City: "+ cityName + ", Temperature: " + temperature + ", Humidity: " + humidity + "%, Condition: " + condition;
    }
}
