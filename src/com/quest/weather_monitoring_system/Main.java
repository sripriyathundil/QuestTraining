package com.quest.weather_monitoring_system;

public class Main {
    public static void main(String[] args) {
        WeatherMonitoringSystem wms = new WeatherMonitoringSystem();
        System.out.println("Welcome to the Weather Monitoring System");
        System.out.println("Adding Weather Data...");
        wms.addCityWeather("New York",22.5,65,"Sunny");
        wms.addCityWeather("Tokyo",18.0,80,"Rainy");
        wms.addCityWeather("Dubai",43.0,25,"Sunny");
        System.out.println("Displaying All Cities:");
        wms.displayCityWeather();
        wms.findExtremes();
        wms.citiesWithHighHumidity();
        wms.generateReport();
        wms.displayAlerts();
    }
}
