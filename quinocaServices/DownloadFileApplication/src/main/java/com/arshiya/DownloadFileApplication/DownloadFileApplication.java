package com.arshiya.DownloadFileApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;


public class DownloadFileApplication {
	 RestTemplate template =new RestTemplate();
	 String baseUrl="http://localhost:8081/usersList/";
	public static void main(String[] args) {


//ForEntityMethodOfRestTemplate forEntityMethodOfRestTemplate=new ForEntityMethodOfRestTemplate();
//forEntityMethodOfRestTemplate.driverMethod();


//	SpringApplication.run(DownloadFileApplication.class, args);

//		HttpHeaders httpHeaders=new HttpHeaders();
//		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
	//	httpHeaders.set("address", "delhi");
	//	HttpEntity<Object> httpEntity=new HttpEntity<>(httpHeaders);
		//getSingleUserFromRestTemplate(httpEntity);
		//getAllUsersFromRestTemplate(httpEntity);
	//	User user=new User();
//		//user.setId((long) 7);
	//	user.setAddress("bhefdfn");
		//user.setFirstName("aadfaaaliiii");
	//	user.setLastName("hfurdfijefkd");
		//httpEntity=new HttpEntity<>(user,httpHeaders);
//		postNewUserWithRestTemplate(httpEntity);
         // updateUserByIdRestTemplate(httpEntity);
       //   deleteUserByIdRestTemplate(httpEntity);

	}
//	private static void deleteUserByIdRestTemplate(HttpEntity<Object> httpEntity){
//		ResponseEntity<String> userResponseEntity=
//				restTemplate.exchange(baseUrl+"1/?address=qdwg",
//						HttpMethod.DELETE,httpEntity,
//						String.class);
//		System.out.println("response is "+userResponseEntity.getStatusCode()+"-------"+
//				userResponseEntity.getHeaders()+"-------"+
//				userResponseEntity.getBody());
//	}
//	private static void updateUserByIdRestTemplate(HttpEntity<Object> httpEntity){
//		ResponseEntity<String> userResponseEntity=
//				restTemplate.exchange(baseUrl+"1/?address=qdwg",
//				 HttpMethod.PUT,httpEntity,
//				String.class);
//		System.out.println("response is "+userResponseEntity.getStatusCode()+"-------"+
//				userResponseEntity.getHeaders()+"-------"+
//				userResponseEntity.getBody());
//	}
//	private static void postNewUserWithRestTemplate(HttpEntity<Object> httpEntity){
//		ResponseEntity<User> responseEntity=restTemplate.exchange(baseUrl, HttpMethod.POST,
//				httpEntity, User.class);
//		System.out.println("The post method response is - "+responseEntity.getBody());
//		System.out.println("response header - "+responseEntity.getHeaders());
//		System.out.println("request entity - "+httpEntity.getHeaders());
//		System.out.println("response status is"+responseEntity.getStatusCode());
//	}
//	private static void getSingleUserFromRestTemplate(HttpEntity<Object> httpEntity){
//
//		ResponseEntity<User> responseEntity=restTemplate.exchange(baseUrl+"1", HttpMethod.GET,
//				httpEntity,User.class);
////		String userString=restTemplate.exchange(baseUrl+"1", HttpMethod.GET,
////				httpEntity,String.class).getBody();
//		System.out.println("The Response body from other service is = "+responseEntity.getBody());
//		//System.out.println("The string of the user extract - "+userString);
//		System.out.println("The http status from the response is - "+responseEntity.getStatusCode());
//		System.out.println("The requested http headers is - "+httpEntity.getBody());
//		System.out.println("The requested http get headers methos o/t is- "+httpEntity.getHeaders());
//
//		System.out.println("The response entity get headers is - "+responseEntity.getHeaders());
//
//	}
//
//	private static void getAllUsersFromRestTemplate(HttpEntity<Object> httpEntity){
//
//
//		ResponseEntity<List> userList=restTemplate.exchange(baseUrl, HttpMethod.GET,
//				httpEntity,List.class);
//
//		System.out.println("The response of list is - "+userList);
//
//		System.out.println("The request headers are - "+httpEntity.getHeaders());
//
//		System.out.println("The response headers are - "+userList.getHeaders());
//
//
//
//	}

}
