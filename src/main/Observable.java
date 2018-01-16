package main;

import java.util.ArrayList;
import java.util.List;

public class Observable {
	List<Observer> observers = new ArrayList<>();

	public void addObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i > -1) {
			observers.remove(o);
		}
	}

	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer obs = observers.get(i);
			obs.updatePrice();
		}
	}

}
