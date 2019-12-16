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
		Map<Integer, BigDecimal> consumerSumMap = new HashMap<>();
		List<String> rejectedList = new ArrayList<>();
		BigDecimal CREDIT_LIMIT = new BigDecimal(creditLimit);
		List<Consumer> consumers = transactions.stream()
				.map(t -> mapToConsumer(t))
				.collect(Collectors.toList());
		consumers.forEach(c -> {
			if (CREDIT_LIMIT.compareTo(c.getAmount()) < 0) {
				rejectedList.add(c.getTransactionId());
			} else {
				int consumerHashCode = c.hashCode();
				BigDecimal existingConsumerSum = consumerSumMap.get(consumerHashCode);
				if (existingConsumerSum != null) {
					BigDecimal newSum = existingConsumerSum.add(c.getAmount());
					if (CREDIT_LIMIT.compareTo(newSum) < 0) {
						rejectedList.add(c.getTransactionId());
					} else {
						consumerSumMap.put(consumerHashCode, newSum);
					}
				} else {
					consumerSumMap.put(consumerHashCode, c.getAmount());
				}
			}
		});
		return rejectedList;
	}

	private static Consumer mapToConsumer(String transaction) {
		String[] consumerArr = transaction.trim().split(",");
		return new Consumer(consumerArr[0], consumerArr[1], consumerArr[2], new BigDecimal(consumerArr[3]), consumerArr[4]);
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
