package observer;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
	private List<Observer> observers = new ArrayList<>();

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers(Order order) {
		for (Observer observer : observers) {
			observer.update(order);
		}
	}
}
