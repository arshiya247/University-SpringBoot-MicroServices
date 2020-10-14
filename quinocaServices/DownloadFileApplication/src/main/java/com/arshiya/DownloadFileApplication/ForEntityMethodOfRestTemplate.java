package com.arshiya.DownloadFileApplication;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

public class ForEntityMethodOfRestTemplate {
    public void driverMethod(){
       // getListOfUserByEntityMethod();
       // getSingleUserByEntityMethod();
        //deleteForEntity();
    }
    static String baseUrl="http://localhost:8081/";
    RestTemplate restTemplate=new RestTemplate();
    private void getListOfUserByEntityMethod(){
        String url=baseUrl+"usersList";
        ResponseEntity<String> responseEntity=restTemplate.getForEntity(url, String.class);
        System.out.println("Response body= "+responseEntity.getBody()+
                " response headers= "+responseEntity.getHeaders()
        +" status code is- "+responseEntity.getStatusCode());
    }
    private void getSingleUserByEntityMethod(){
        String url=baseUrl+"usersList/2";
        ResponseEntity<UserEE> responseEntity=restTemplate.getForEntity(url,
                UserEE.class);
        UserEE user=responseEntity.getBody();
        System.out.println("Response body= "+user+
                " response headers= "+responseEntity.getHeaders()
                +" status code is- "+responseEntity.getStatusCode());
    }
//    private void updateUserByEntityMethod(){
//        String url=baseUrl+"usersList/2/?address=Hyderabad";
//ResponseEntity<String> responseEntity=restTemplate.postForEntity(url, String.class);
//    }
    private void addUserWithForEntityMethod(){
        String url=baseUrl+"usersList";
        UserEE user=new UserEE();
        user.setLastName("Avaaram");
        user.setFirstName("Aaliya");
        user.setAddress("Hydeeer");

ResponseEntity<UserEE> responseEntity=restTemplate.postForEntity(url, user, UserEE.class);
URI uri=restTemplate.postForLocation(url,url, UserEE.class);
        System.out.println("The post for locations repsons eis- "+uri);
        System.out.println("Response body= "+user+
                " response headers= "+responseEntity.getHeaders()
                +" status code is- "+responseEntity.getStatusCode());
    }
    private void deleteForEntity(){
        String url=baseUrl+"usersList/2";
        restTemplate.delete(url,String.class);
        System.out.println("Deleted");
    }
}
