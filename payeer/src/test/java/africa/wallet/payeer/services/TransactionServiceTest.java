package africa.wallet.payeer.services;

import africa.wallet.payeer.data.models.Wallet;
import africa.wallet.payeer.dtos.requests.DepositRequest;
import africa.wallet.payeer.dtos.requests.TransactionRequest;
import africa.wallet.payeer.dtos.response.TransactionResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
@AllArgsConstructor
public class TransactionServiceTest {

    private final TransactionService transactionService;

    private final CustomerService customerService;

    @Test
    //@Slf4j
    public void testThatTransactionForDepositCanBeCreated(){
        TransactionRequest transactionRequest = new TransactionRequest();
        transactionRequest.setAmount(new BigDecimal("1000.00"));
        transactionRequest.setSenderAccountNumber("23456789012");
        transactionRequest.setRecipientAccountNumber("0092435125");
        transactionRequest.setDescription("Transfer Between Customers");
        transactionRequest.setStatus("PENDING");
        TransactionResponse response = transactionService.getTransactionBy(transactionRequest);
        assertThat(response).isNotNull();
        assertThat(response.getStatus()).isEqualTo("");
    }

    @Test
    public void testTransferFromWalletWithFlutterWave(TransactionRequest transactionRequest) {
        Wallet customerWallet = transactionService.createTransaction(transactionRequest);
        customerWallet.setId(transactionRequest.getId());
        customerWallet.setAccountNumber(transactionRequest.getSenderAccountNumber());
    }

    private static TransactionRequest createTransaction(String accountNumber, BigDecimal amount){
        var transaction = new TransactionRequest();
        transaction.setSenderAccountNumber(accountNumber);
        transaction.setRecipientAccountNumber(accountNumber);
        transaction.setAmount(new BigDecimal("4000"));
        return transaction;
    }


}
