package com.gz.design.oberserver;

public class Client {
    public static void main(String[] args) {
        CurrentConditions currentConditions1 = new CurrentConditions();
        currentConditions1.setName("beijing");
        CurrentConditions currentConditions2 = new CurrentConditions();
        currentConditions2.setName("hainan");
        WeatherData weatherData = new WeatherData();
        weatherData.regsisterObsserver(currentConditions1);
        weatherData.regsisterObsserver(currentConditions2);
        weatherData.setData("   18.c   ","  452  ");

    }
}
