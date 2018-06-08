package org.omerfarooq.challenge.business.service;

import org.omerfarooq.challenge.exception.TransactionExpiredException;
import org.omerfarooq.challenge.exception.TransactionOutOfFutureWindow;
import org.omerfarooq.challenge.persistence.entity.Transaction;
import org.omerfarooq.challenge.presentation.json.TransactionPostJson;

public interface TransactionService {
	
	public Transaction process(TransactionPostJson json) throws TransactionExpiredException, TransactionOutOfFutureWindow;

}
