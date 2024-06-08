package dio.beans_versus_components.App;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.google.gson.Gson;

@Configuration
public class Beans {
    @Bean
    public Gson gson(){
        return new Gson();
    }
}