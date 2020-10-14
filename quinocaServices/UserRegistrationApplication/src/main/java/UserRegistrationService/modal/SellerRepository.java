package UserRegistrationService.modal;

import UserRegistrationService.dto.Seller;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends CrudRepository<Seller,Long>{

}
