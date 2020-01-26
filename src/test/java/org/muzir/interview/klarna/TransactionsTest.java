package org.muzir.interview.klarna;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;


public class TransactionsTest {
	@Test
	public void ifTransactionListIsEmpty_thenReturnEmptyList() {
		assertEquals(Arrays.asList(), Transactions.findRejectedTransactions(Arrays.asList(), 0));
	}

	@Test
	public void ifTransactionAmountEqualToCredit_thenReturnEmptyList() {
		assertEquals(Arrays.asList(), Transactions.findRejectedTransactions(Arrays.asList("John,Doe,john@doe.com,200,TR0001"), 200));
	}

	@Test
	public void ifOneTransactionAndTransactionAmountGreaterThanCredit_thenReturnOneRejectedTransaction() {
		assertEquals(Arrays.asList("TR0001"), Transactions.findRejectedTransactions(Arrays.asList("Jane,Doe,jane@doe.com,201,TR0001"), 200));
	}

	@Test
	public void ifTransactionSumAmountGreaterThanCreditAfterSecondTransaction_thenRejectedSecondTransaction() {
		assertEquals(Arrays.asList("TR0002"), Transactions.findRejectedTransactions(Arrays.asList("Jane,Doe,jane@doe.com,199,TR0001", "Jane,Doe,jane@doe.com,2,TR0002"), 200));
	}
}
