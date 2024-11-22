package africa.wallet.payeer.services;

import africa.wallet.payeer.data.models.Wallet;
import africa.wallet.payeer.data.repositories.WalletRepository;
import africa.wallet.payeer.dtos.requests.WalletDepositRequest;
import africa.wallet.payeer.dtos.response.WalletDepositResponse;
import africa.wallet.payeer.exceptions.WalletNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AppWalletService implements WalletService {

    private final WalletRepository walletRepository;
    //private final ModelMapper modelMapper;

    @Override
    public WalletDepositResponse deposit(WalletDepositRequest walletDepositRequest) throws WalletNotFoundException {
        Wallet wallet = walletRepository.findById(walletDepositRequest.getWalletId())
                .orElseThrow(()->new WalletNotFoundException(
                        String.format("wallet with id %d not found",
                                walletDepositRequest.getWalletId())
                ));
        wallet.setBalance(wallet.getBalance().add(walletDepositRequest.getAmount()));
        walletRepository.save(wallet);
        WalletDepositResponse walletDepositResponse = new WalletDepositResponse();
        walletDepositResponse.setStatus("SUCCESS");
        walletDepositResponse.setAmount(walletDepositRequest.getAmount());
        return walletDepositResponse;
    }

}
