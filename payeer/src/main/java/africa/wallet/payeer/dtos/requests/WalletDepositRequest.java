package africa.wallet.payeer.dtos.requests;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class WalletDepositRequest {
    private Long walletId;
    private BigDecimal amount;
}
