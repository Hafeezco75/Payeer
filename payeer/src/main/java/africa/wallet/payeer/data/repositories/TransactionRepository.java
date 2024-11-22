package africa.wallet.payeer.data.repositories;

import africa.wallet.payeer.data.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
