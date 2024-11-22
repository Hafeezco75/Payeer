package africa.wallet.payeer.services;

import africa.wallet.payeer.dtos.requests.TransactionRequest;
import africa.wallet.payeer.dtos.response.TransactionResponse;
import africa.wallet.payeer.exceptions.TransactionNotFoundException;

public interface TransactionService {

    TransactionResponse createTransaction(TransactionRequest transactionRequest) throws TransactionNotFoundException;

    TransactionResponse getTransactionBy(TransactionRequest transactionRequest);


}
