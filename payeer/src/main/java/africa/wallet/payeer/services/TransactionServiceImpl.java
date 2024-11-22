package africa.wallet.payeer.services;

import africa.wallet.payeer.data.models.Transaction;
import africa.wallet.payeer.data.models.TransactionStatus;
import africa.wallet.payeer.data.repositories.TransactionRepository;
import africa.wallet.payeer.dtos.requests.TransactionRequest;
import africa.wallet.payeer.dtos.response.TransactionResponse;
import africa.wallet.payeer.exceptions.TransactionNotFoundException;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private final CustomerService customerService;

    private final TransactionRepository transactionRepository;
    private final ModelMapper modelMapper;

    @Override
    public TransactionResponse createTransaction(TransactionRequest transactionRequest) throws TransactionNotFoundException {
        Transaction transaction = transactionRepository.findById(transactionRequest.getId())
                .orElseThrow(()-> new TransactionNotFoundException(
                        String.format("transaction with id %d not found",
                                transactionRequest.getId())
                ));
        transaction.setSender(transactionRequest.getSender());
        transaction.setRecipient(transactionRequest.getRecipient());
        transactionRepository.save(transaction);
        TransactionResponse transactionResponse = new TransactionResponse();
        transactionResponse.setStatus(TransactionStatus.PENDING.toString());
        modelMapper.map(transaction, transactionResponse);
        return transactionResponse;


    }

    @Override
    public TransactionResponse getTransactionBy(TransactionRequest transactionRequest) {
        TransactionResponse transactionResponse = new TransactionResponse();
        modelMapper.map(transactionRequest, transactionResponse);
        transactionRequest.getId();
        return transactionResponse;
    }




}
