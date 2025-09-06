package observer;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// Create the order system
		OrderSystem orderSystem = new OrderSystem();

		// Create and add observers
		Observer notificationSystem = new NotificationSystem();
		orderSystem.addObserver(notificationSystem);

		// Create some orders
		LocalDateTime now = LocalDateTime.now();
		Order order1 = new Order("1", "John Doe", "Laptop", 2, 1999.98, now.plusDays(1));
		Order order2 = new Order("2", "Jane Smith", "Smartphone", 1, 799.99);
		Order order3 = new Order("3", "Alice Johnson", "Tablet", 3, 1200.00);

		// Add orders to the system
		orderSystem.createOrder(order1);
		orderSystem.createOrder(order2);
		orderSystem.createOrder(order3);

		// Get and print all orders sorted by date
		List<Order> orders = orderSystem.getOrdersSortedByDate();
		System.out.println("Orders sorted by date:");
		for (Order order : orders) {
			System.out.println(order);
		}

		// Cancel an order
		orderSystem.cancelOrder(order1);

		// Get and print all orders sorted by date after cancellation
		List<Order> updatedOrders = orderSystem.getOrdersSortedByDate();
		System.out.println("\nOrders sorted by date after cancellation:");
		for (Order order : updatedOrders) {
			System.out.println(order);
		}
	}
}
