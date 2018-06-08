package org.omerfarooq.challenge.business.service.impl;

import org.omerfarooq.challenge.business.service.StatisticService;
import org.omerfarooq.challenge.business.service.TransactionService;
import org.omerfarooq.challenge.business.util.DateUtil;
import org.omerfarooq.challenge.exception.TransactionExpiredException;
import org.omerfarooq.challenge.exception.TransactionOutOfFutureWindow;
import org.omerfarooq.challenge.persistence.entity.Transaction;
import org.omerfarooq.challenge.presentation.json.TransactionPostJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {
	
	@Autowired
	private StatisticService statisticService;

	@Override
	public Transaction process(TransactionPostJson json) throws TransactionExpiredException, TransactionOutOfFutureWindow {
		
		Transaction transaction = new Transaction();
		transaction.setAmount(json.getAmount());
		transaction.setDate(DateUtil.convertToLocalDateTime(json.getTimestamp()));
		
		this.statisticService.add(transaction);
		
		return transaction;
		
	}
	
}
