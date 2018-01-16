package main;

public class Article extends Observable {
	private double price;

	public Article(double price) {
		this.price = price;
	}

	public void setPrice(double price) {
		this.price = price;
		super.notifyObservers();
	}

	public double getPrice() {
		return this.price;
	}
}
