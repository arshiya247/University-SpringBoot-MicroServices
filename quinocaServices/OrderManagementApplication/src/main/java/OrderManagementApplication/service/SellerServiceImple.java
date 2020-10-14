package OrderManagementApplication.service;

import OrderManagementApplication.dto.Seller;
import OrderManagementApplication.service.hystrix.HystrixCommandExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
public class SellerServiceImple implements SellerService {

    Logger logger = LoggerFactory.getLogger(SellerServiceImple.class);


private HystrixCommandExample hystrixCommandExample;


    public SellerServiceImple(HystrixCommandExample hystrixCommandExample) {
        this.hystrixCommandExample = hystrixCommandExample;
    }

    //@HystrixCommand(commandProperties = {@HystrixProperty(
//        name = "timeout.enabled",
//           value = "true")}, fallbackMethod =
//"fallBackForAddingSeller" ,commandKey = "ordermanagementApplication")
//    @HystrixCommand(fallbackMethod = "fallBackForAddingSeller"
//            ,commandKey = "ordermanagementApplication")
//    @HystrixProperty(name = "timeout.enabled",
//            value = "false")

    @Override
    public String addSeller(@RequestBody Seller seller) {
        long startTime=System.currentTimeMillis();
String response=hystrixCommandExample.addSeller(seller);
        logger.info("Add seller call time total taken in : {} ",
                System.currentTimeMillis() - startTime);
        return response;
    }
   @Override
    public ResponseEntity<List> getAllSellersList() {
    //    long startTime=System.currentTimeMillis();
//        HttpHeaders httpHeaders=new HttpHeaders();
//        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
//        HttpEntity<Seller> httpEntity=new HttpEntity<>(httpHeaders);
        long startTime1=System.currentTimeMillis();
        logger.info("hitting the user service");
       ResponseEntity<List> responseEntity=hystrixCommandExample.getAllSellersList();
        logger.info("Add seller call time total taken in : {} ",
                System.currentTimeMillis() - startTime1);
        return responseEntity;
    }
}
//        HttpHeaders httpHeaders=new HttpHeaders();
//        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
//        HttpEntity<Seller> httpEntity=new HttpEntity<>(seller,httpHeaders);
//        return restTemplate.exchange( "http://localhost:8092/add-seller", HttpMethod.POST,
//                httpEntity,Seller.class);
//
//commandProperties = {
//@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",
//        value = "5500")
//}