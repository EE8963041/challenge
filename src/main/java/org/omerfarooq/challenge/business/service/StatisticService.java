package org.omerfarooq.challenge.business.service;

import java.util.List;

import org.omerfarooq.challenge.exception.TransactionExpiredException;
import org.omerfarooq.challenge.exception.TransactionOutOfFutureWindow;
import org.omerfarooq.challenge.persistence.entity.Statistic;
import org.omerfarooq.challenge.persistence.entity.Transaction;

public interface StatisticService {
	
	public List<Statistic> findAll();
	public Statistic findCurrent();
	
	public void add(Transaction transaction) throws TransactionExpiredException, TransactionOutOfFutureWindow;
	
}
