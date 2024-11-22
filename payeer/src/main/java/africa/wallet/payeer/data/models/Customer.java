package africa.wallet.payeer.data.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import static jakarta.persistence.CascadeType.PERSIST;

@Getter
@Setter
@Entity
public class Customer {
    @Id
    private Long id;
    @OneToOne(cascade = PERSIST)
    private Wallet wallet;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Transaction> transactions;
}
