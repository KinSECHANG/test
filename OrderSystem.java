package observer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrderSystem extends OrderManager {
	private List<Order> orders = new ArrayList<>();

	public void createOrder(Order order) {
		orders.add(order);
		notifyObservers(order);
	}

	public void cancelOrder(Order order) {
		orders.remove(order);
		notifyObservers(order);
	}

	public List<Order> getOrdersSortedByDate() {
		orders.sort(Comparator.comparing(Order::getCreatedAt));
		return orders;
	}
}
