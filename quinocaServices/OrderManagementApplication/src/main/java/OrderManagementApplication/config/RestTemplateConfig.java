package OrderManagementApplication.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.client.RootUriTemplateHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriTemplateHandler;

@Configuration
public class RestTemplateConfig {


    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
//        UriTemplateHandler uriTemplateHandler=new RootUriTemplateHandler(
//                "http://localhost:8092");
        return restTemplateBuilder.build();
    }
}
