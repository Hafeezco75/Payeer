package africa.wallet.payeer.dtos.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class WalletDepositResponse {
    private String status;
    private BigDecimal amount;
}
