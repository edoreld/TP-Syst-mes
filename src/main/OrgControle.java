package main;

public class OrgControle extends Observer {
	Article article;

	public OrgControle(Article article) {
		this.article = article;
		article.addObserver(this);
	}

	@Override
	public void updatePrice() {
		this.price = article.getPrice();
		if (price > 100) {
			alert();
		}

	}

	private void alert() {
		// buy the item
	}
}
