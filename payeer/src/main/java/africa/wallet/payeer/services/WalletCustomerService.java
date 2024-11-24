package africa.wallet.payeer.services;

import africa.wallet.payeer.data.models.Customer;
import africa.wallet.payeer.data.models.Wallet;
import africa.wallet.payeer.data.repositories.CustomerRepository;
import africa.wallet.payeer.data.repositories.WalletRepository;
import africa.wallet.payeer.dtos.requests.DepositRequest;
import africa.wallet.payeer.dtos.requests.FlutterwaveTransferRequest;
import africa.wallet.payeer.dtos.requests.TransactionRequest;
import africa.wallet.payeer.dtos.requests.WalletDepositRequest;
import africa.wallet.payeer.dtos.response.DepositResponse;
import africa.wallet.payeer.dtos.response.FlutterwaveTransferResponse;
import africa.wallet.payeer.dtos.response.WalletDepositResponse;
import africa.wallet.payeer.exceptions.UserNotFoundException;
import africa.wallet.payeer.exceptions.WalletNotFoundException;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

@Service
@AllArgsConstructor
public class WalletCustomerService implements CustomerService {

    private final ModelMapper modelMapper;
    private final WalletService walletService;
    private final CustomerRepository customerRepository;
    private final TransactionService transactionService;


    @Override
    public DepositResponse deposit(DepositRequest depositRequest) throws UserNotFoundException, WalletNotFoundException {
        Customer customer = getCustomerFor(depositRequest);
        Wallet wallet = customer.getWallet();
        WalletDepositRequest walletDepositRequest = createWalletDepositRequest(depositRequest, wallet);
        WalletDepositResponse walletDepositResponse = walletService.deposit(walletDepositRequest);
        return createCustomerDepositResponse(depositRequest,walletDepositResponse,wallet);
    }


    private DepositResponse createCustomerDepositResponse(DepositRequest depositRequest, WalletDepositResponse walletDepositResponse, Wallet wallet) {
        DepositResponse depositResponse = new DepositResponse();
        depositResponse.setStatus(depositResponse.getStatus());
        TransactionRequest transactionRequest = createTransactionRequest(depositRequest, walletDepositResponse, wallet);
        transactionService.createTransaction(transactionRequest);
        return depositResponse;
    }


    private WalletDepositRequest createWalletDepositRequest(DepositRequest depositRequest, Wallet wallet) {
        WalletDepositRequest walletDepositRequest = new WalletDepositRequest();
        walletDepositRequest.setWalletId(wallet.getId());
        walletDepositRequest.setAmount(depositRequest.getAmount());
        return walletDepositRequest;
    }


    private Customer getCustomerFor(DepositRequest depositRequest) throws UserNotFoundException {
        Customer customer = customerRepository.findById(depositRequest.getCustomerId())
                .orElseThrow(()-> new UserNotFoundException(
                        String.format("Customer with id %d not found", depositRequest.getCustomerId())));
        return customer;
    }


    private static TransactionRequest createTransactionRequest(DepositRequest depositRequest, WalletDepositResponse response, Wallet customerWallet) {
        TransactionRequest transactionRequest = new TransactionRequest();
        transactionRequest.setStatus(response.getStatus());
        transactionRequest.setAmount(depositRequest.getAmount());
        transactionRequest.setSenderAccountNumber(depositRequest.getSenderAccountNumber());
        transactionRequest.setRecipientAccountNumber(customerWallet.getAccountNumber());
        transactionRequest.setTransactionDate(LocalDate.now());
        transactionRequest.setDescription(depositRequest.getDescription());
        return transactionRequest;
    }



    public FlutterwaveTransferResponse transfer(FlutterwaveTransferRequest transferRequest){
        String BearerAuth = "";
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(BearerAuth);
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForEntity(BearerAuth,FlutterwaveTransferResponse.class,);
        HttpEntity<FlutterwaveTransferRequest> request = new HttpEntity<>(transferRequest, headers);
        request.getBody();
        return null;
    }

}
