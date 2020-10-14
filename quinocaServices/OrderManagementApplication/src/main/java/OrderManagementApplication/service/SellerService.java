package OrderManagementApplication.service;

import OrderManagementApplication.dto.Seller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


public interface SellerService {

    public String addSeller(@RequestBody Seller seller);
    public ResponseEntity<List> getAllSellersList();
    //public String fallBackForAddingSeller(Seller seller, Throwable t);
}
