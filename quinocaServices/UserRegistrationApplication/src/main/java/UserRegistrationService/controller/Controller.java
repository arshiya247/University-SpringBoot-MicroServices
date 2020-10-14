package UserRegistrationService.controller;

import UserRegistrationService.dto.Seller;
import UserRegistrationService.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private SellerService sellerService;

    @GetMapping("/test")
    public String test(){
        return "User Registration App is Working";
    }

    @GetMapping("/seller-list")
    public ResponseEntity<Object> getAllSellersAvailable(){
        try {
            List<Seller> sellerList=sellerService.getAllSellerList();
            if(!sellerList.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body(sellerList);
        }}catch (Exception e){
            return
                    ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).
                            body(e.getLocalizedMessage());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @PostMapping("/add-seller")
    public ResponseEntity<Object> addNewSeller(@RequestBody Seller seller){

        if(!seller.getFirstName().isEmpty()){
            try{
                Thread.sleep(5500);
                if(sellerService.addSeller(seller)!=null)
                    return ResponseEntity.status(HttpStatus.OK).body(seller);

            }catch (Exception e){
                return
                        ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).
                                body(e.getLocalizedMessage());
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

}
