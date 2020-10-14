package UserRegistrationService.service;

import UserRegistrationService.dto.Seller;
import UserRegistrationService.modal.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


public interface SellerService {
    @Transactional
    public Seller addSeller(Seller seller);
    public List<Seller> getAllSellerList();


}
