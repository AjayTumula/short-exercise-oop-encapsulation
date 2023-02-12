package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    private String location;
    private double temperature;

    private final int TEMP_CONST = 32;

    private final double CONVERSION_TO_FAHRENHEIT_VALUE = (9.0 / 5.0);

    private final int MIN_TEMP_THRESHOLD = 10;

    private final int MAX_TEMP_THRESHOLD = 30;


    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public String showTemperature() {
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.", location, checkWeather(), checkTemperature(), convertToFahrenheit());

    }

    public double convertToFahrenheit() {
        return CONVERSION_TO_FAHRENHEIT_VALUE * temperature + TEMP_CONST;
    }

    public String checkWeather() {

        if (checkWeather().equals(location.equals("London"))) {
            return "🌦";

        } else if (checkWeather().equals(location.equals("California"))) {
            return "🌅";

        } else if (location.equals("Cape Town")) {
            return "🌤";

        }
        return "🔆";
    }

    public String checkTemperature() {
        if (temperature > MAX_TEMP_THRESHOLD) {

            return "It's too hot 🥵!";

        } else if (temperature < MIN_TEMP_THRESHOLD) {

            return "It's too cold 🥶!";

        }
        return "Ahhh...it's just right 😊!";
    }

}
