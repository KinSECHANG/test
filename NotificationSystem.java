package observer;

public class NotificationSystem implements Observer {
	@Override
	public void update(Order order) {
		sendNotification(order);
	}

	private void sendNotification(Order order) {
		System.out.println("Sending notification to customer:\n" + order + "\n");
	}
}
