package org.muzir.interview.klarna;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Transactions {

	public static List<String> findRejectedTransactions(List<String> transactions, int creditLimit) {
		if (transactions.isEmpty()) {
			return Collections.emptyList();
		}
		List<Consumer> consumers = transactions.stream()
				.map(t -> mapToConsumer(t))
				.collect(Collectors.toList());
		Balance balance = new Balance(new BigDecimal(creditLimit));
		return getRejectedList(consumers, balance);
	}

	private static List<String> getRejectedList(List<Consumer> consumers, Balance balance) {
		List<String> rejectedList = new ArrayList<>();
		consumers.forEach(consumer -> {
			if (isTransactionAmountGreaterThanCreditLimit(balance.creditLimit, consumer.getAmount())) {
				rejectedList.add(consumer.getTransactionId());
			} else {
				if (hasConsumerTransactionExceedCreditLimit(balance, consumer)) {
					rejectedList.add(consumer.getTransactionId());
				}
			}
		});
		return rejectedList;
	}

	private static boolean hasConsumerTransactionExceedCreditLimit(Balance balance, Consumer consumer) {
		BigDecimal existingConsumerBalance = getConsumerBalance(consumer.hashCode(), balance.consumerBalances);
		if (existingConsumerBalance != null) {
			BigDecimal newSum = existingConsumerBalance.add(consumer.getAmount());
			if (isTransactionAmountGreaterThanCreditLimit(balance.creditLimit, newSum)) {
				return true;
			} else {
				addConsumerBalance(consumer.hashCode(), newSum, balance.consumerBalances);
			}
		} else {
			addConsumerBalance(consumer.hashCode(), consumer.getAmount(), balance.consumerBalances);
		}
		return false;
	}

	private static BigDecimal getConsumerBalance(int consumerHashCode, Map<Integer, BigDecimal> consumerBalances) {
		return consumerBalances.get(consumerHashCode);
	}

	private static BigDecimal addConsumerBalance(int consumerHashCode, BigDecimal consumerBalance, Map<Integer, BigDecimal> consumerBalances) {
		return consumerBalances.put(consumerHashCode, consumerBalance);
	}

	private static boolean isTransactionAmountGreaterThanCreditLimit(BigDecimal creditLimit, BigDecimal transactionAmount) {
		return creditLimit.compareTo(transactionAmount) < 0;
	}

	private static Consumer mapToConsumer(String transaction) {
		String[] consumerArr = transaction.trim().split(",");
		return new Consumer(consumerArr[0], consumerArr[1], consumerArr[2], new BigDecimal(consumerArr[3]), consumerArr[4]);
	}

	static class Balance {
		private final BigDecimal creditLimit;
		private Map<Integer, BigDecimal> consumerBalances = new HashMap<>();

		public Balance(BigDecimal creditLimit) {
			this.creditLimit = creditLimit;
		}
	}

	static class Consumer {
		private final String name;
		private final String surname;
		private final String email;
		private final BigDecimal amount;
		private final String transactionId;

		public Consumer(String name, String surname, String email, BigDecimal amount, String transactionId) {
			this.name = name;
			this.surname = surname;
			this.email = email;
			this.amount = amount;
			this.transactionId = transactionId;
		}

		public BigDecimal getAmount() {
			return amount;
		}

		public String getTransactionId() {
			return transactionId;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Consumer consumer = (Consumer) o;
			return name.equals(consumer.name) &&
					surname.equals(consumer.surname) &&
					email.equals(consumer.email);
		}

		@Override
		public int hashCode() {
			return Objects.hash(name, surname, email);
		}
	}
}
