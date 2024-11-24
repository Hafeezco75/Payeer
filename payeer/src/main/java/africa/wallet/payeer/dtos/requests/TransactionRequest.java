package africa.wallet.payeer.dtos.requests;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;


@Getter
@Setter
public class TransactionRequest {
    private Long id;
    private String senderAccountNumber;
    private String recipientAccountNumber;
    private BigDecimal amount;
    private String description;
    private LocalDate transactionDate;
    private String Status;
}
