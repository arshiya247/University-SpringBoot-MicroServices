package UserRegistrationService.service;

import UserRegistrationService.dto.Seller;
import UserRegistrationService.modal.SellerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class SellerServiceImpl implements SellerService {
    @Autowired
    private SellerRepository sellerRepository;
    private static final Logger logger = LoggerFactory.getLogger(SellerServiceImpl.class);
    @Override
    @Transactional
    public Seller addSeller(Seller seller) {
    sellerRepository.save(seller);
    logger.info("Seller added with id - {}",seller.getId());
    return seller;
    }

    @Override
    public List<Seller> getAllSellerList() {
        return (List<Seller>) sellerRepository.findAll();
    }
}
