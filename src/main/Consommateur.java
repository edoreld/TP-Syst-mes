package main;

public class Consommateur extends Observer {
	Article article;
	double price;

	public Consommateur(Article article) {
		this.article = article;
		article.addObserver(this);
	}

	@Override
	public void updatePrice() {
		this.price = article.getPrice();
		if (price < 10) {
			buy();
		}

	}

	private void buy() {
		// buy the item
	}
}
