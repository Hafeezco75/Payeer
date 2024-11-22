package africa.wallet.payeer.data.repositories;

import africa.wallet.payeer.data.models.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, Long> {


}
