package org.muzir.interview.klarna;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class TransactionsTest {
	@Test
	public void ifTransactionListIsEmpty_thenReturnEmptyList() {
		assertEquals(List.of(), Transactions.findRejectedTransactions(List.of(), 0));
	}

	@Test
	public void ifTransactionAmountEqualToCredit_thenReturnEmptyList() {
		assertEquals(List.of(), Transactions.findRejectedTransactions(List.of("John,Doe,john@doe.com,200,TR0001"), 200));
	}

	@Test
	public void ifOneTransactionAndTransactionAmountGreaterThanCredit_thenReturnOneRejectedTransaction() {
		assertEquals(List.of("TR0001"), Transactions.findRejectedTransactions(List.of("Jane,Doe,jane@doe.com,201,TR0001"), 200));
	}

	@Test
	public void ifTransactionSumAmountGreaterThanCreditAfterSecondTransaction_thenRejectedSecondTransaction() {
		assertEquals(List.of("TR0002"), Transactions.findRejectedTransactions(List.of("Jane,Doe,jane@doe.com,199,TR0001", "Jane,Doe,jane@doe.com,2,TR0002"), 200));
	}
}
