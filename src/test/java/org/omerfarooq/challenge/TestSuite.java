package org.omerfarooq.challenge;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.omerfarooq.challenge.business.service.StatisticServiceTest;
import org.omerfarooq.challenge.business.service.TransactionServiceTest;
import org.omerfarooq.challenge.business.util.DateUtilTest;
import org.omerfarooq.challenge.presentation.controller.StatisticControllerTest;
import org.omerfarooq.challenge.presentation.controller.TransactionControllerTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ DateUtilTest.class, StatisticServiceTest.class, TransactionServiceTest.class, TransactionControllerTest.class, StatisticControllerTest.class })
public class TestSuite {

}
