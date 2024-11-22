package africa.wallet.payeer.dtos.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepositResponse {
    private String message;
    private String status;
}
