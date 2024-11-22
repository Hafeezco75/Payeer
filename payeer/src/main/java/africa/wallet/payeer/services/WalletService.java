package africa.wallet.payeer.services;

import africa.wallet.payeer.dtos.requests.WalletDepositRequest;
import africa.wallet.payeer.dtos.response.WalletDepositResponse;
import africa.wallet.payeer.exceptions.WalletNotFoundException;

public interface WalletService {

    WalletDepositResponse deposit(WalletDepositRequest walletDepositRequest) throws WalletNotFoundException;

}
