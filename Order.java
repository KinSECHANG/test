package observer;

import java.time.LocalDateTime;

public class Order {
	private String id;
	private String customerName;
	private String product;
	private int quantity;
	private double price;
	private LocalDateTime createdAt;

	public Order(String id, String customerName, String product, int quantity, double price) {
		this.id = id;
		this.customerName = customerName;
		this.product = product;
		this.quantity = quantity;
		this.price = price;
		this.createdAt = LocalDateTime.now();
	}

	public Order(String id, String customerName, String product, int quantity, double price, LocalDateTime createdAt) {
		this.id = id;
		this.customerName = customerName;
		this.product = product;
		this.quantity = quantity;
		this.price = price;
		this.createdAt = createdAt;
	}

	public String getId() {
		return id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	@Override
	public String toString() {
		return "Order{" + "id='" + id + '\'' + ", customerName='" + customerName + '\'' + ", product='" + product + '\''
				+ ", quantity=" + quantity + ", price=" + price + ", createdAt=" + createdAt + '}';
	}
}
