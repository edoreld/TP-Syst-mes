package exo3;

public class Employe extends Handler {
	protected int plafondDepense;
	protected String nom;

	public Employe(int plafondDepense, String nom) {
		super();
		this.plafondDepense = plafondDepense;
		this.nom = nom;
	}

	public int getPlafondDepense() {
		return plafondDepense;
	}

	public void setPlafondDepense(int plafondDepense) {
		this.plafondDepense = plafondDepense;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public void handleRequest(MyRequest request) {
		if (request.getValue() <= this.getPlafondDepense()) {
			System.out.println(nom + " a donné son accord pour une dépense de " + request.getValue());
		} else {
			super.succesor.handleRequest(request);
		}

	}
}
