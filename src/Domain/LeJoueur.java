package Domain;

public class LeJoueur {
	private String nom;
	private String prenom;
	private int score = 0;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public LeJoueur(String nom, String prenom, Integer score) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.score = score;
	}
	
	public LeJoueur() {
		
	}
	
	
	public void ajoutScore() {
		this.score += 10;
	}
	
	
}
