package br.com.gouveia.weatherforecastbycityccp3anbua;

import java.util.List;

public class ForecastData {
    public List<WeatherData> getList() {
        return list;
    }

    public void setList(List<WeatherData> list) {
        this.list = list;
    }

    private List<WeatherData> list;


}
