package hello;

import hello.model.Forecast;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForecastRepo extends MongoRepository <Forecast,String> {

}
