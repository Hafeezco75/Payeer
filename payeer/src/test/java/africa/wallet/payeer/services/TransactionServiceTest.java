package africa.wallet.payeer.services;

import africa.wallet.payeer.dtos.requests.TransactionRequest;
import africa.wallet.payeer.dtos.response.TransactionResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
@AllArgsConstructor
public class TransactionServiceTest {

    private final TransactionService transactionService;

    private final CustomerService customerService;

    @Test
    @Slf4j
    public void testThatTransactionForDepositCanBeCreated(){
        TransactionRequest transactionRequest = new TransactionRequest();
        transactionRequest.setId();
        transactionRequest.setAmount();
        transactionRequest.setSender();
        transactionRequest.setRecipient();
        transactionRequest.setDescription();
        transactionRequest.setStatus("PENDING");
        TransactionResponse response = transactionService.getTransactionBy(transactionRequest);
        assertThat(response).isNotNull();
        assertThat(response.getStatus()).isEqualTo("");

    }


}
