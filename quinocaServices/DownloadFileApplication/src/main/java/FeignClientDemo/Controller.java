package FeignClientDemo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser/{id}")
    public User getDetails(@PathVariable("id") String id){
        return userService.getUserDetails(id);
    }

    @PutMapping("/{id}/{address}")
    public String updateUser(@PathVariable("address") String address, @PathVariable("id") String id){
        return userService.updateUser(id,address);
    }

    @PostMapping("/postingUser")
    public String addNewUser(@RequestParam User user){
return userService.addNewUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") String id){
        return userService.deleteUser(id);
    }

}
