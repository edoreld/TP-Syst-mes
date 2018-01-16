package exo3;

public class Client {
	public Client() {

	}

	public static void main(String[] args) {
		Handler h1 = new Employe(10, "Pedro");
		Handler h2 = new Employe(20, "Maria");
		Handler h3 = new Employe(30, "Gustavo");

		h1.setSuccesor(h2);
		h2.setSuccesor(h3);

		h1.handleRequest(new MyRequest(5));
		h1.handleRequest(new MyRequest(15));
		h1.handleRequest(new MyRequest(25));
	}
}
