package africa.wallet.payeer.services;

import africa.wallet.payeer.dtos.requests.DepositRequest;
import africa.wallet.payeer.dtos.response.DepositResponse;
import africa.wallet.payeer.exceptions.UserNotFoundException;
import africa.wallet.payeer.exceptions.WalletNotFoundException;

public interface CustomerService {

    DepositResponse deposit(DepositRequest depositRequest) throws UserNotFoundException, WalletNotFoundException;


}
