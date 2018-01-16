package main;

public class Test {
	public static void main(String[] args) {
		Article article = new Article(100.0);

		Consommateur cons = new Consommateur(article);

		article.setPrice(1);

	}
}
