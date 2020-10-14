package OrderManagementApplication.controller;

import OrderManagementApplication.dto.Seller;
import OrderManagementApplication.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private SellerService sellerService;


//    @PostMapping(value = "add-seller",
//            consumes = "application/json", produces = "application/json")
//    @ResponseBody
////    @PostMapping("add-seller")
//    public ResponseEntity<String> addSeller(@RequestBody Seller seller){
//        return sellerService.addSeller(seller);
//    }
    @RequestMapping(value="/add-seller", method = RequestMethod.POST)
    public String saveInfo( @RequestBody Seller seller) {

        return  sellerService.addSeller(seller);
    }
    @GetMapping("/seller-list")
    public ResponseEntity<List> getAllSeller(){
        return sellerService.getAllSellersList();
    }
}
