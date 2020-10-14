package OrderManagementApplication.service.hystrix;

import OrderManagementApplication.dto.Seller;
import OrderManagementApplication.service.SellerServiceImple;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class HystrixCommandExample {
    Logger logger = LoggerFactory.getLogger(SellerServiceImple.class);
    private RestTemplate restTemplate;

    public HystrixCommandExample(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ResponseEntity<List> getAllSellersList(){
        return restTemplate.getForEntity("http://localhost:8092/seller-list",
                List.class );
    }


    @HystrixCommand(commandKey="ordermanagementApplication",
            fallbackMethod="fallBackForAddingSeller",commandProperties = {
@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",
       value = "5500")}
    )
    public String addSeller(Seller seller){
       String response= restTemplate.postForObject(
               "http://localhost:8092/add-seller", seller
                ,String.class);
       return response;
    }
    public String fallBackForAddingSeller(Seller seller,Throwable t){
        logger.error("Inside fallback cause - {}", t.toString());
        return "In fallback Method Some error happened.";
    }
}
