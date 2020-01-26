package org.muzir.interview.klarna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Smoothie {

	public static String ingredients(String order) {
		if (order == null || order.equals("")) {
			throw new IllegalArgumentException("Invalid Input");
		}
		String allergic = getAllergic(order);
		String[] orderValues = getOrderValues(order);
		return prepareOrders(orderValues, allergic);
	}

	private static String[] getOrderValues(String order) {
		String[] orders = order.split(",");
		String orderMenuOption = orders[0];
		return MENU_OPTIONS.getValue(orderMenuOption);
	}

	private static String getAllergic(String order) {
		String[] orders = order.split(",");
		List<String> allergicOrders = new ArrayList<>();
		if (orders.length == 1) {
			return "";
		}
		for (int i = 1; i < orders.length; i++) {
			String allergicOrder = orders[i];
			if (allergicOrder.startsWith("-")) {
				allergicOrders.add(orders[i].substring(1));
			} else {
				throw new IllegalArgumentException("As adding new ingredients is not supported yet");
			}
		}
		return allergicOrders.stream().collect(Collectors.joining(","));
	}

	private static String prepareOrders(String[] orderValues, String allergic) {
		List<String> orders = Arrays.stream(orderValues).collect(Collectors.toList());
		List<String> allergicOrder = Arrays.stream(allergic.split(",")).collect(Collectors.toList());

		allergicOrder.stream().forEach(alergicOrder -> {
			if (orders.contains(alergicOrder)) {
				orders.remove(alergicOrder);
			}
		});
		String result = orders.stream().sorted().collect(Collectors.joining(","));
		return result;
	}

	enum MENU_OPTIONS {
		CLASSIC("Classic", new String[]{"strawberry", "banana", "pineapple", "mango", "peach", "honey"}),
		FREEZIE("Freezie", new String[]{"blackberry", "blueberry", "black currant", "grape juice", "frozen yogurt"}),
		GREENIE("Greenie", new String[]{"green apple", "lime", "avocado", "spinach", "ice", "apple juice"}),
		JUST_DESSERTS("Just Desserts", new String[]{"banana", "ice cream", "chocolate", "peanut", "cherry"});

		private String name;
		private String[] value;

		MENU_OPTIONS(String name, String[] value) {
			this.name = name;
			this.value = value;
		}

		public static String[] getValue(String paramName) {
			return Arrays.stream(values()).filter(menuOptions -> menuOptions.name.equals(paramName)).findAny().map(m -> m.value).orElseThrow(IllegalArgumentException::new);
		}
	}
}
