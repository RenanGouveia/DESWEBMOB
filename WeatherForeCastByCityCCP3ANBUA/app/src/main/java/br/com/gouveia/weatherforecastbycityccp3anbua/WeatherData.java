package br.com.gouveia.weatherforecastbycityccp3anbua;

import java.util.List;
public class WeatherData {

    private Long dt;
    private WeatherDataDetails main;
    private List<ImageDetails> weather;

    public List<ImageDetails> getWeather() {
        return weather;
    }

    public void setWeather(List<ImageDetails> weather) {
        this.weather = weather;
    }

    public WeatherDataDetails getMain() {
        return main;
    }

    public void setMain(WeatherDataDetails main) {
        this.main = main;
    }

    public Long getDt() {
        return dt;
    }

    public void setDt(Long dt) {
        this.dt = dt;
    }
}
