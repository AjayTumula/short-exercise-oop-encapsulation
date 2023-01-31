package com.techreturners.encapsulation.bankaccount.test;

import com.techreturners.encapsulation.bankaccount.model.WeatherReporter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherReporterTest {

    @Test
    public void testCheckWeatherForCalifornia() {
        WeatherReporter reporter = new WeatherReporter("California", 40);
        assertEquals("🌅", reporter.checkWeather());
    }

    @Test
    public void testCheckWeatherForCapeTown() {
        WeatherReporter reporter = new WeatherReporter("Cape Town", 40);
        assertEquals("🌤", reporter.checkWeather());
    }

    @Test
    public void testCheckWeatherForIndia() {
        WeatherReporter reporter = new WeatherReporter("India", 40);
        assertEquals("🔆", reporter.checkWeather());
    }

    @Test
    public void testCheckTemperatureForAvgTemp() {
        WeatherReporter reporter = new WeatherReporter("London", 25);
        assertEquals("Ahhh...it's just right 😊!", reporter.checkTemperature());
    }


    @Test
    public void testCheckTemperatureForMinTemp() {
        WeatherReporter reporter = new WeatherReporter("Canada", 8);
        assertEquals("It's too cold 🥶!", reporter.checkTemperature());
    }

    @Test
    public void testCheckTemperatureForMaxTemp() {
        WeatherReporter reporter = new WeatherReporter("Dubai", 43);
        assertEquals("It's too hot 🥵!", reporter.checkTemperature());
    }

}
