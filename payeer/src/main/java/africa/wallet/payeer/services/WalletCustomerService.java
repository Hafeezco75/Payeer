package africa.wallet.payeer.services;

import africa.wallet.payeer.data.models.Customer;
import africa.wallet.payeer.data.repositories.CustomerRepository;
import africa.wallet.payeer.data.repositories.WalletRepository;
import africa.wallet.payeer.dtos.requests.DepositRequest;
import africa.wallet.payeer.dtos.response.DepositResponse;
import africa.wallet.payeer.exceptions.UserNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class WalletCustomerService implements CustomerService {


    private final WalletService walletService;
    private final CustomerRepository customerRepository;

    @Override
    public DepositResponse deposit(DepositRequest depositRequest) throws UserNotFoundException {
        Customer customer = customerRepository.findById(depositRequest.getWalletId())
                .orElseThrow(() -> new UserNotFoundException(
                        String.format("user with id %d not found",
                            depositRequest.getWalletId())
                ));
        customer.setId(customer.getId());
        customer.setWallet(customer.getWallet());
        customerRepository.save(customer);
        DepositResponse depositResponse = new DepositResponse();
        depositResponse.setMessage("Transaction completed");
        depositResponse.setStatus("SUCCESSFUL");
        return depositResponse;
    }
}
