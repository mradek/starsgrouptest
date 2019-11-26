package hello.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.Gson;
import org.springframework.data.annotation.Id;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {
    @Id
    private String id;

    private List<Main> list;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    private class Main {
        int temp;
        int temp_min;
        int temp_max;
        int pressure;
        int sea_level;
        int grnd_level;
        int humidity;

        public int getTemp() {
            return temp;
        }

        public void setTemp(int temp) {
            this.temp = temp;
        }

        public int getTemp_min() {
            return temp_min;
        }

        public void setTemp_min(int temp_min) {
            this.temp_min = temp_min;
        }

        public int getTemp_max() {
            return temp_max;
        }

        public void setTemp_max(int temp_max) {
            this.temp_max = temp_max;
        }

        public int getPressure() {
            return pressure;
        }

        public void setPressure(int pressure) {
            this.pressure = pressure;
        }

        public int getSea_level() {
            return sea_level;
        }

        public void setSea_level(int sea_level) {
            this.sea_level = sea_level;
        }

        public int getGrnd_level() {
            return grnd_level;
        }

        public void setGrnd_level(int grnd_level) {
            this.grnd_level = grnd_level;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }
    }

    private class Wind {
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

}
