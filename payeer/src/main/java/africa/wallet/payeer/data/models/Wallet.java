package africa.wallet.payeer.data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
public class Wallet {
    @Id
    private Long id;
    private BigDecimal balance;
    private String accountNumber;

    public Wallet() {balance = BigDecimal.ZERO;}
}
