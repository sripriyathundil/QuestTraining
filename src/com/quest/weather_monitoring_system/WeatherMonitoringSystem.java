package com.quest.weather_monitoring_system;

import java.util.concurrent.Callable;

public class WeatherMonitoringSystem {
     City[] cities;
     int cityCount;

    public WeatherMonitoringSystem() {
        cities = new City[3];
    }

    public void addCityWeather(String cityName, double temperature, int humidity, String condition) {
        if (cityCount < cities.length) {
            City city = new City(cityName, temperature, humidity, condition);
            cities[cityCount] = city;
            cityCount++;
            System.out.println(cityCount + ". City: " + cityName + ", Temperature: " + temperature + ", Humidity: " + humidity + "%");
        }
    }

    public void updateCityWeather(String cityName, double temperature, int humidity, String condition) {
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].getCityName().equalsIgnoreCase(cityName)) {
                cities[i].setWeather(temperature, humidity, condition);
                System.out.println("Weather updated");
                return;
            }
        }
        System.out.println("City not found");
    }

    public void displayCityWeather() {
        if (cityCount == 0) {
            System.out.println("No cities found");
        } else {
            for (int i = 0; i < cities.length; i++) {
                System.out.println((i + 1) + ". " + cities[i]);
            }
        }
    }

    public void displayCity(String cityName) {
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].getCityName().equalsIgnoreCase(cityName)) {
                System.out.println(cities[i]);
                return;
            }
        }
        System.out.println("City not found");
    }

    public void findExtremes() {
        if (cityCount == 0) {
            System.out.println("No cities found");
            return;
        }
        City highest = cities[0];
        City lowest = cities[0];
        for (int i = 1; i < cities.length; i++) {
            if (cities[i].getTemperature() > highest.getTemperature()) {
                highest = cities[i];
            }
            if (cities[i].getTemperature() < lowest.getTemperature()) {
                lowest = cities[i];
            }
        }
        System.out.println("City with the Highest Temperature: " + highest.getCityName() + "(" + highest.getTemperature() + ")");
        System.out.println("City with the Highest Temperature: " + lowest.getCityName() + "(" + lowest.getTemperature() + ")");
    }

    public void citiesWithHighHumidity() {
        boolean found = false;
        System.out.println("Cities with Humidity > 80%:");
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].getHumidity() > 80) {
                System.out.println(cities[i].getHumidity());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No cities found");
        }
    }

    public void generateReport() {
        String[] conditions = new String[3];
        for (int i = 0; i < cityCount; i++) {
            System.out.println(conditions + ": ");
            boolean first = false;
            for (int j = 0; j < i; j++) {
                if (cities[j].getCondition().equalsIgnoreCase(cities[i].getCondition())) {
                    first = true;
                    break;
                }
            }
            if (!first) {
                System.out.print(cities[i].getCondition() + ": ");
                for (int k = 0; k < cityCount; k++) {
                    if (cities[k].getCondition().equalsIgnoreCase(cities[i].getCondition())) {
                        if (k != i) {
                            System.out.println(", ");
                        }
                        System.out.print(cities[k].getCityName());
                    }
                }
                System.out.println();
            }
        }
        double sum = 0;
        for (int i = 0; i < cities.length; i++) {
            sum += cities[i].getTemperature();
        }
        if (cityCount == 0) {
            System.out.println("No cities found");
        } else {
            double avg = sum / cities.length;
            System.out.println("Average temperature: " + avg);
        }
    }
    public void displayAlerts(){
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].getTemperature()>40){
                System.out.println("Heatwave Alert: "+cities[i].getCityName() + "is experiencing extreme heat (" + cities[i].getTemperature() + "Celsius)");
            }
            if(cities[i].getHumidity()<20){
                System.out.println("Low Humidity Warning:" + cities[i].getHumidity() + "has very low humidity (" + cities[i].getTemperature() + "%)");
            }
        }
    }
}