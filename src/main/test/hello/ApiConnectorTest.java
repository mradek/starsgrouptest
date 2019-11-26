package hello;

import hello.model.Forecast;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApiConnectorTest {

    private Forecast getMockForecast(){
        Forecast mockForecast = new Forecast();
            //TODO here set the mock for test
        return mockForecast;
    }

    @Test
    void run() {
        Forecast forecast = new ApiConnector().run();
        assertEquals(forecast.getList().size(), 3);
        //TODO here we can check the mock vs the actual, if we know exactly what is expected.
        //assertEquals(mockForecast, forecast);

    }
}