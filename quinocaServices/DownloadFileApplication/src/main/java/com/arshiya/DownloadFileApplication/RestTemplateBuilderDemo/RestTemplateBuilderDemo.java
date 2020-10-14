package com.arshiya.DownloadFileApplication.RestTemplateBuilderDemo;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.client.RootUriTemplateHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriTemplateHandler;

import java.time.Duration;

@Configuration
public class RestTemplateBuilderDemo {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
        UriTemplateHandler uriTemplateHandler=
                new RootUriTemplateHandler("http://localhost:8081/usersList");
        return restTemplateBuilder.uriTemplateHandler(uriTemplateHandler)
                .setReadTimeout(Duration.ofMinutes(1))
                .build();
    }
}
