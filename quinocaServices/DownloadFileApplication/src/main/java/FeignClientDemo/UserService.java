package FeignClientDemo;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "${service.base.name}",url = "${service.base.url}")
public interface UserService {

    @GetMapping("/usersList/{id}")
    User getUserDetails(@PathVariable("id") String id);

    @PutMapping("/usersList/{id}/{address}")
     String updateUser( @PathVariable("id") String id,@PathVariable("address") String address);

    @DeleteMapping("/usersList/{id}")
     String deleteUser(@PathVariable("id") String id);

    @PostMapping("/usersList")
     String addNewUser(@RequestBody User user);
}
