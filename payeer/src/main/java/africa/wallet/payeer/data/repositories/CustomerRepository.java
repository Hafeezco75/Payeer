package africa.wallet.payeer.data.repositories;

import africa.wallet.payeer.data.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {


}
