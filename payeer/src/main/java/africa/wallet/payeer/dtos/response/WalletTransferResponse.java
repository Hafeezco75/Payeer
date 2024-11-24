package africa.wallet.payeer.dtos.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WalletTransferResponse {
    private String status;
    private String message;
    private FlutterwaveTransferData data;

}
