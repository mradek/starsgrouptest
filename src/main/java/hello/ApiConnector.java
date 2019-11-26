package hello;

import hello.model.Forecast;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

class ApiConnector {

    private static final Logger log = LoggerFactory.getLogger(ApiConnector.class);

    //TODO this could be parameterised for various calls the fixed vars could them be removed
    Forecast run() {
        RestTemplate restTemplate = new RestTemplate();
        String FIXED_CITY = "q=Leeds,GB";
        String FIXED_APP_ID = "&appid=b6907d289e10d714a6e88b30761fae22";
        String FIXED_BASE_URL = "https://samples.openweathermap.org/data/2.5/history/city?";

        Forecast forecast = restTemplate.getForObject(FIXED_BASE_URL + FIXED_CITY + FIXED_APP_ID, Forecast.class);
        log.info(forecast.toString());
        return forecast;
    }
}

