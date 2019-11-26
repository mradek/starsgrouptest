package hello;

import hello.model.Forecast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @Autowired
    private ForecastRepo forecastRepo;

    @RequestMapping("/api")
    public String home() {
        //get data from some API inside ApiConnector
        Forecast forecast = new ApiConnector().run();

        //on this point we have json response as POJO we can do all sorts of modifications;

        //save to MongoDB
        forecastRepo.insert(forecast);

        //For achieving the advanced task
        //from here we could send of the data to a separate application probably best to do it via http request
        //as then it could reside in isolated environment, that application cold then be responsible for handling MongoDB.
        //Queuing would be done in the other application.
        return forecast.toString();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
