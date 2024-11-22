package africa.wallet.payeer.services;

import africa.wallet.payeer.dtos.requests.DepositRequest;
import africa.wallet.payeer.dtos.response.DepositResponse;
import africa.wallet.payeer.exceptions.UserNotFoundException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import java.math.BigDecimal;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class CustomerServiceTest {

    @Autowired
    private CustomerService customerService;

    @Test
    //@Sql({"/db/data.sql"})
    public void testThatCustomerCanDeposit() throws UserNotFoundException {
        Long walletId = 2L;
        BigDecimal depositAmount = new BigDecimal("1000.00");
        String description = "this is just a test for  deposit functionality";
        DepositRequest depositRequest = new DepositRequest();
        depositRequest.setWalletId(walletId);
        depositRequest.setAmount(depositAmount);
        depositRequest.setDescription(description);
        DepositResponse depositResponse = customerService.deposit(depositRequest);

        assertNotNull(depositResponse);
        assertThat(depositResponse.getMessage()).isEqualTo("Transaction completed");
        assertEquals("SUCCESSFUL", depositResponse.getStatus());

    }

}
