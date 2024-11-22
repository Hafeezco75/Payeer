package africa.wallet.payeer.services;

import africa.wallet.payeer.dtos.requests.WalletDepositRequest;
import africa.wallet.payeer.dtos.response.WalletDepositResponse;
import africa.wallet.payeer.exceptions.WalletNotFoundException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class WalletServiceTest {

    @Autowired
    private WalletService walletService;

    @Test
    //@Sql({"/db/data.sql"})
    public void testCanDepositIntoWallet() throws WalletNotFoundException {
        WalletDepositRequest walletDepositRequest = new WalletDepositRequest();
        Long walletId = 200L;
        BigDecimal amount = new BigDecimal("4000");
        walletDepositRequest.setWalletId(walletId);
        walletDepositRequest.setAmount(amount);
        WalletDepositResponse walletDepositResponse = walletService.deposit(walletDepositRequest);
        assertNotNull(walletDepositResponse);
        assertEquals("SUCCESS", walletDepositResponse.getStatus());
    }

}
